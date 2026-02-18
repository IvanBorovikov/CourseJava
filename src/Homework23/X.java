package Homework23;

public class X {
    String s1 = "hello";
}

class Y extends X{
    boolean bool = false;
}


class Test{
    public static void abc(X x, Y y){
        System.out.println("Hello");
    }

    public static void abc(Y y, X x){
        System.out.println("bye");
    }

    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.s1 + " ");
    }
}