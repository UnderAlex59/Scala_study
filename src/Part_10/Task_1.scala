package Part_10
import java.awt.Rectangle
import java.awt.geom.Ellipse2D.{Double => EllipsDouble}

object Task_1 extends App {
  val egg = new EllipsDouble(5,10,20,30) with RectangleLike
  println(s"X : ${egg.getX}, Y : ${egg.getY}, WIDTH : ${egg.getWidth}, HEIGHT : ${egg.getHeight}")
  egg.translate(10,-10)
  println(s"X : ${egg.getX}, Y : ${egg.getY}, WIDTH : ${egg.getWidth}, HEIGHT : ${egg.getHeight}")
  egg.grow(10,20)
  println(s"X : ${egg.getX}, Y : ${egg.getY}, WIDTH : ${egg.getWidth}, HEIGHT : ${egg.getHeight}")
}


trait RectangleLike extends java.awt.geom.Ellipse2D{
  def translate(dx : Double, dy : Double): Unit = {

    var x = getX
    var y = getY
    var width = getWidth
    var height = getHeight

    var oldv  = x
    var newv = oldv + dx;

    if (dx < 0) {
      // moving leftward
      if (newv > oldv) {
        // negative overflow
        // Only adjust width if it was valid (>= 0).
        if (width >= 0) {
          // The right edge is now conceptually at
          // newv+width, but we may move newv to prevent
          // overflow.  But we want the right edge to
          // remain at its new location in spite of the
          // clipping.  Think of the following adjustment
          // conceptually the same as:
          // width += newv; newv = MIN_VALUE; width -= newv;
          width += newv - Integer.MIN_VALUE;
          // width may go negative if the right edge went past
          // MIN_VALUE, but it cannot overflow since it cannot
          // have moved more than MIN_VALUE and any non-negative
          // number + MIN_VALUE does not overflow.
        }
        newv = Integer.MIN_VALUE;
      }
    } else {
      // moving rightward (or staying still)
      if (newv < oldv) {
        // positive overflow
        if (width >= 0) {
          // Conceptually the same as:
          // width += newv; newv = MAX_VALUE; width -= newv;
          width += newv - Integer.MAX_VALUE;
          // With large widths and large displacements
          // we may overflow so we need to check it.
          if (width < 0) width = Integer.MAX_VALUE;
        }
        newv = Integer.MAX_VALUE;
      }
    }
    x = newv;

    oldv = y;
    newv = oldv + dy;
    if (dy < 0) {
      // moving upward
      if (newv > oldv) {
        // negative overflow
        if (height >= 0) {
          height += newv - Integer.MIN_VALUE;
          // See above comment about no overflow in this case
        }
        newv = Integer.MIN_VALUE;
      }
    } else {
      // moving downward (or staying still)
      if (newv < oldv) {
        // positive overflow
        if (height >= 0) {
          height += newv - Integer.MAX_VALUE;
          if (height < 0) height = Integer.MAX_VALUE;
        }
        newv = Integer.MAX_VALUE;
      }
    }
    y = newv;
    setFrame(x,y,width,height)
  }

  def grow(h : Double, v : Double): Unit = {
    var x0 = getX
    var y0 = getY
    var x1 = getWidth
    var y1 = getHeight

    x1 += x0;
    y1 += y0;

    x0 -= h;
    y0 -= v;
    x1 += h;
    y1 += v;

    if (x1 < x0) {
      // Non-existent in X direction
      // Final width must remain negative so subtract x0 before
      // it is clipped so that we avoid the risk that the clipping
      // of x0 will reverse the ordering of x0 and x1.
      x1 -= x0;
      if (x1 < Integer.MIN_VALUE) x1 = Integer.MIN_VALUE;
      if (x0 < Integer.MIN_VALUE) x0 = Integer.MIN_VALUE;
      else if (x0 > Integer.MAX_VALUE) x0 = Integer.MAX_VALUE;
    } else { // (x1 >= x0)
      // Clip x0 before we subtract it from x1 in case the clipping
      // affects the representable area of the rectangle.
      if (x0 < Integer.MIN_VALUE) x0 = Integer.MIN_VALUE;
      else if (x0 > Integer.MAX_VALUE) x0 = Integer.MAX_VALUE;
      x1 -= x0;
      // The only way x1 can be negative now is if we clipped
      // x0 against MIN and x1 is less than MIN - in which case
      // we want to leave the width negative since the result
      // did not intersect the representable area.
      if (x1 < Integer.MIN_VALUE) x1 = Integer.MIN_VALUE;
      else if (x1 > Integer.MAX_VALUE) x1 = Integer.MAX_VALUE;
    }

    if (y1 < y0) {
      // Non-existent in Y direction
      y1 -= y0;
      if (y1 < Integer.MIN_VALUE) y1 = Integer.MIN_VALUE;
      if (y0 < Integer.MIN_VALUE) y0 = Integer.MIN_VALUE;
      else if (y0 > Integer.MAX_VALUE) y0 = Integer.MAX_VALUE;
    } else { // (y1 >= y0)
      if (y0 < Integer.MIN_VALUE) y0 = Integer.MIN_VALUE;
      else if (y0 > Integer.MAX_VALUE) y0 = Integer.MAX_VALUE;
      y1 -= y0;
      if (y1 < Integer.MIN_VALUE) y1 = Integer.MIN_VALUE;
      else if (y1 > Integer.MAX_VALUE) y1 = Integer.MAX_VALUE;
    }

    setFrame(x0,y0,x1,y1)
  }
}
