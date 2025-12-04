package Homework11;


public class Car {
    public String color;
    String engine;
    int amount;

    public Car(String color, String engine, int amount){
        this.color = color;
        this.engine = engine;
        this.amount = amount;
    }
}


class CarTest{
    public static int amountDoor(Car car, int amountDoor){
        car.amount = amountDoor;
        return amountDoor;

    }

    public static void colorChange(Car car1, Car car2){
        String color1 = car1.color;
        String color2 = car2.color;
        car1.color = color2;
        car2.color = color1;
        System.out.println(car1.color);
        System.out.println(car2.color);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Black", "V6", 6);
        Car c2 = new Car("White", "V12", 4);
        colorChange(c1, c2);
        System.out.println("Первая машина: " +  c1.color + " " + c1.engine + " " + amountDoor(c1, 8));
        System.out.println("Вторая машина: " +  c2.color + " " + c2.engine + " " + amountDoor(c2, 2));
    }
}
