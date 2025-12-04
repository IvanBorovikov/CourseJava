package Lesson9;

public class Student {
    public int a = 10;
    public static int b = 12;
    public static int c = 13;
}


class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;
        st1 = null;
    }
}