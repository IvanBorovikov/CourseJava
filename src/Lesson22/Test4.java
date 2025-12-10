package Lesson22;

public class Test4 {

}

class HumanTest2 {

    HumanTest2(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    String name;
    String surname;
}

class Student2 extends HumanTest2{
    int course;
    Student2(String name, String surname, int course){
        super(name, surname);
        this.course = course;
    }
    public static void main(String[] args) {
        Student2 s = new Student2("Ivan", "Borovikov", 2);
        System.out.println(s.name);
        System.out.println(s.surname);
        System.out.println(s.course);
    }
}
