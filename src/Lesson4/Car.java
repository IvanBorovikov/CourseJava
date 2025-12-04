package Lesson4;

import Lesson5.Car2;

public class Car {
    Car(String cvet, String motor) {
        color = cvet;
        engine = motor;
        System.out.println("Цвет: " + color + " Мотор: " + engine);
    }

    String color;
    String engine;
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "V8");
        Car car2 = new Car("Black", "V12");
    }
}
