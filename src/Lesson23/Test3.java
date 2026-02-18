package Lesson23;

import Homework10.p1.p4.p5.E;

public class Test3 {
    public static void main(String[] args) {
        EmployeeTest t = new TeacherTest();
        t.eat();
    }
}

//class Eda{}
//class Frukti extends Eda{
//}


//class EmployeeTest {
//    double salary = 100;
//    String name;
//    int experience;
//    int age;
//
//    Eda eat(){
//        System.out.println("Кушает работник");
//        Eda e = new Eda();
//        return e;
//    }
//
//    void sleep(){
//        System.out.println("Спать");
//    }
//}
//
//
//class TeacherTest extends EmployeeTest {
//    private int countStudents;
//
//    Frukti eat(){
//        System.out.println("Кушает учитель");
//        Frukti f = new Frukti();
//        return f;
//    }
//
//    void learn(){
//        System.out.println("Учить");
//    }
//}

//class A{
//    EmployeeTest objectCreation(){
//        return new EmployeeTest();
//    }
//}
//
//class B extends A{
//    TeacherTest objectCreation(){
//        System.out.println("OK");
//        return new TeacherTest();
//    }
//}