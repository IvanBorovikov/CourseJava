package Lesson24;

public class Test5 {
}

interface I1{
    default void abc(){
        System.out.println("Это метод abc");
    }
    static void def(){
        System.out.println("Статичный метод");
    }
}


abstract class R{
    public static void main(String[] args) {
        I1.def();
    }
}

