package Lesson14;

public class Test2 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++){
            System.out.println(i);
            i++;
            abc(12);
        }
    }

    static void abc(int n){
        System.out.println(n);
    }
}
