package Lesson16;

public class Test5 {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = s1.toLowerCase();

        System.out.println(s2);

        String s3 = s1.toUpperCase();
        System.out.println(s3);

        boolean b = s1.contains("ld");
        System.out.println(b);
    }
}
