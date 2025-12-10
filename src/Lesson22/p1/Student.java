package Lesson22.p1;

import Lesson22.*;


public class Student extends HumanTest {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();

        HumanTest h = new HumanTest();
        System.out.println(h.salary);
        h.rest();
    }

}
