package Lesson6;

public class MethodOverloading {

    void show(int i1) {
        System.out.println(i1);
        System.out.println("Data type is int");
    }

    void show(int i1, int i2) {
        System.out.println(i1);
        System.out.println("Data type is int");
    }

    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }

    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data type is string");
    }

    void show(String s, int a) {

        System.out.println("String: " + s + " int: " + a);
    }

    void show(int s, String a) {

        System.out.println("Какой сегодня хороший день!");
    }

}


class MethodOverloadingTest {

    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        int a = 500;
        m1.show(a);
        boolean b = true;
        m1.show(b);
        String str = "text";
        m1.show(str);
        m1.show("Привет", 12);
        m1.show(12, "Привет");
    }
}