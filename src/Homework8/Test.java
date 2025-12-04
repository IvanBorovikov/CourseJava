package Homework8;

public class Test {

    public static int multiply(int a, int b, int c){
        return a * b * c;
    }

    public static void divide(int a, int b){
        int result = a / b;
        int result2 = a % b;
        System.out.println("the whole private: " + result);
        System.out.println("%: " + result2);

    }
}


class Test1 {
    public static void main(String[] args) {
        System.out.println(Test.multiply(2, 3, 4));
        System.out.println(Test.multiply(2, 3, 4));
        Test.divide(10, 2);
        Test.divide(10, 2);
    }
}
