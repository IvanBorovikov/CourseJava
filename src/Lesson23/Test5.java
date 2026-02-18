package Lesson23;

public class Test5 {
    public static void main(String[] args) {
//        EmployeeTest emp1 = new EmployeeTest();
//        emp1.sleep();
//        EmployeeTest emp2 = new TeacherTest();
//        emp2.sleep();
        TeacherTest t = new TeacherTest();
        t.eat();
//        t.sleep();

    }
}
class Eda{}
class Frukti extends Eda{
}
class EmployeeTest {
    double salary = 100;
    String name;

    final public Eda eat(){
        System.out.println("Кушает работник");
        Eda e = new Eda();
        return e;
    }

    final static void sleep(){
        System.out.println("Спит работник");
    }
}


class TeacherTest extends EmployeeTest {
    private int countStudents;

//    public Eda eat(){
//        System.out.println("Кушает учитель");
//        Frukti f = new Frukti();
//        return f;
//    }

//    static void sleep(){
//        System.out.println("Спит учитель");
//    }

    void learn(){
        System.out.println("Учить");
    }
}

final class T{}
//class P extends T{}