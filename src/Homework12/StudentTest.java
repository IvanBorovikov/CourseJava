package Homework12;
import Lesson11.Student;
import Lesson11.Student.*;

public class StudentTest {

    public static void sravnenieStudent(Student st1, Student st2){
        if(st1.equals(st2)){
            System.out.println("Равны");
        }
        else {
            System.out.println("Не равны");
        }
    }

    public static void sravnenieVSEX(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            System.out.println("Равны " + st1.name + " " + st2.name);
            if (st1.course == st2.course) {
                System.out.println("Равен " + st1.course + " " + st2.course);}
            else {System.out.println("Не равен " + st1.course + " " + st2.course);}
            if (st1.grade == st2.grade){
                System.out.println("Равен " + st1.grade + " " + st2.grade);}
            else {
                System.out.println("Не равны " + st1.grade + " " + st2.grade);}}
        else {
            System.out.println("Не равны: " + st1.name + " " + st2.name);
        }
    }


    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 3, 5.4);
        Student s2 = new Student("Petr", 3, 5.4);
        sravnenieStudent(s1, s2);
        sravnenieVSEX(s1, s2);


    }


}

