package Lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name1, int course1){
        count++;
        name = name1;
        course = course1;
        System.out.println("Student № " + count);
    }

    public static void showCount(){
        System.out.println("Count: " + count);
    }


    void abc(){
        a++;
        count++;
    }

    static void abcd(){
        count++;
        Student st1 = new Student("Ivan", 1);
        st1.a++;

    }

    public void showInfo(){
        System.out.println("Welcome to the Student");
    }

    public static void main(String[] args) {
        abcd();
        Student st3 = new Student("Vasya", 2);
        st3.abc();
    }
}


