package Homework6;

public class Overloaded {
   int sum() {
       return 0;
   }

   int sum(int a) {
       int result = a;
       System.out.println("Вывод: " + result);
       return result;
   }

   int sum(int a, int b) {
       int result = a + b;
       System.out.println("Вывод: " + result);
       return result;
   }

   int sum(int a, int b, int c) {
       int result = a + b + c;
       System.out.println("Вывод: " + result);
       return result;
   }

   int sum(int a, int b, int c, int d) {
       int result = a + b + c + d;
       System.out.println("Вывод: " + result);
       return result;
   }

}



class OverloadedTest{
    public static void main(String[] args) {
        Overloaded v1 = new Overloaded();
        v1.sum();
        v1.sum(2);
        v1.sum(2, 2);
        v1.sum(2, 2, 2);
        v1.sum(2, 2, 2, 5);
        v1.sum(2, 5);
    }
}

