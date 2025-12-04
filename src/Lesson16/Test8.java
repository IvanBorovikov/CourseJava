package Lesson16;

public class Test8 {
    public static void main(String[] args) {
        String s10 = "Привет! Как ты?";
        String s11 = "привет! как ты?";
        System.out.println(s10.equals(s11));
        System.out.println(s10.equalsIgnoreCase(s11));
    }
}
