package Lesson13;

public class Employee {
    public static void main(String[] args) {
        int day = 2;
        int a = 4;
        final int b;
        b = 10;

        switch (day*3){
            case -1:

            case 2/2:

            case 3:

            case 4:

            case 5:
                System.out.println("Работа до 18:00");
                break;
            case 6:
                System.out.println("Работа до 14:00");
                break;
            case 7:
                System.out.println("Работы нет");
            default:
                System.out.println("Такого дня нет");

        }
    }
}
