package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("Privet");
        String s2 = new String("abcdefgabcd");
        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int c2 = s1.indexOf("t");
        System.out.println(c2);

        int c3 = s1.indexOf("vet");
        System.out.println(c3);

        int c4 = s1.indexOf("z");
        System.out.println(c4);

        int i1 = s2.indexOf("a", 5);
        System.out.println(i1);

        boolean b1 = s2.startsWith("abc", 7);
        System.out.println(b1);

        boolean b2 = s2.endsWith("abc");
        System.out.println(b2);
    }
}
