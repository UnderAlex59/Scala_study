package Part_5;

public class Car_Task_9_JavaEdit {
    private String maker;
    private String model;
    private Integer age = -1;
    private String number = "";

    public Car_Task_9_JavaEdit(String maker, String model, Integer age, String number) {
        this.maker = maker;
        this.model = model;
        this.age = age;
        this.number = number;
    }

    public Car_Task_9_JavaEdit(String maker, String model, Integer age) {
        this.maker = maker;
        this.model = model;
        this.age = age;
    }

    public Car_Task_9_JavaEdit(String maker, String model, String number) {
        this.maker = maker;
        this.model = model;
        this.number = number;
    }

    public Car_Task_9_JavaEdit(String maker, String model) {
        this.maker = maker;
        this.model = model;
    }
}
