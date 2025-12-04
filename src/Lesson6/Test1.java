package Lesson6;

public class Test1 {
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sredArifm(int x, int y, int z) {
        return sum(x, y, z) / 3;
    }

}


class Test2{
    public static void main(String[] args) {
        Test1 t = new Test1();
        int res = t.sredArifm(2, 3, 4);
        System.out.println(res);
    }
}
