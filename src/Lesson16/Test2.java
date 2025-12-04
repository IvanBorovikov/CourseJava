package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        String s10 = s1.substring(3);
        System.out.println(s10);

        String s11 = s1.substring(3, 7);
        System.out.println(s11);

        String s12 = s1.replace("abc", "ccc");
        System.out.println(s12);

        String s2 = "Privet, ";
        String s3 = "drug";
        String s4 = s2.concat(s3);
        System.out.println(s4);


    }
}
