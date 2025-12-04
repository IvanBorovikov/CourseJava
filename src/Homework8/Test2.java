package Homework8;

import Lesson6.Test1;

public class Test2 {
    static final double Pi = 3.14;

    public double radius(double r){
        return Pi * r * r;
    }

    public static double circumference(double r2){
        return 2 * Pi * r2;
    }

    public void info(double radius3){
        System.out.println("Радиус: " + radius3);
        System.out.println("Площадь: " + radius(radius3));
        System.out.println("Длина: " + circumference(radius3));
    }

}

class Test3{
    public static void main(String[] args) {
        Test2 inf = new Test2();
        inf.radius(2);
        inf.info(2);
        Test2.circumference(2);
    }
}