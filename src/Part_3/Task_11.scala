package Part_3
import java.awt.datatransfer._

object Task_11 {
  def main(args: Array[String]): Unit = {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    val buffer = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
    println(buffer)
  }

}
