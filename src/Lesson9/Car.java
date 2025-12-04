package Lesson9;

public class Car {
    String color;
    String engine;
    static int count;


    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }


    public static void main(String[] args) {
        Car c = new Car("red", "V6");

    }
}
