package Lesson5;

public class Test20 {
    // Параметры внутри скобок
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int sredneeArifm(int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1) / 3;
        return result2;

    }
}



class Test21 {
    public static void main(String[] args) {
        Test20 t = new Test20();
        int ThreeChisla = t.summa(2, 2, 2); // Аргументы внутри скобок
        System.out.println(ThreeChisla);
        int srArfm = t.sredneeArifm(20, 35, 35);
        System.out.println(srArfm);
    }
}