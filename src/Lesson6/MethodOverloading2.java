package Lesson6;

public class MethodOverloading2 {
    public int sum(int i1, int i2){
        return i1 + i2;
    }


    protected String sum(String s1, String s2) {
        return s1 + s2;
    }


    protected void sum(int a, String b) {
        System.out.println("Привет");
    }
}



class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 m2 = new MethodOverloading2();
        int a = m2.sum(33, 22);
        String b = m2.sum("Первое число", " Второе число");
        System.out.println(a);
        System.out.println(b);
    }
}
