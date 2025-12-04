package Homework;

public class Student {
    int numberTicket;
    String FirstName;
    String LastName;
    int yearTeaching;
    double AvergeMath;
    double AvergeEconomy;
    double AvergeInostr;







}



class StudentTest {

    double Average(Student st1) {
        double result = (st1.AvergeEconomy + st1.AvergeMath + st1.AvergeInostr) / 3;
        System.out.println("Средняя оценка: " + result);
        return result;

    }


    public static void main(String[] args) {



        Student OneStudent = new Student();
        Student TwoStudent = new Student();
        Student ThreeStudent = new Student();
        Student FourStudent = new Student();

        OneStudent.numberTicket = 10;
        OneStudent.FirstName = "Ivan";
        OneStudent.LastName = "Borovikov";
        OneStudent.yearTeaching = 2010;
        OneStudent.AvergeMath = 4.5;
        OneStudent.AvergeEconomy = 4.0;
        OneStudent.AvergeInostr = 3.5;


        System.out.println("Номер билета: " + OneStudent.numberTicket);
        System.out.println("Имя: " + OneStudent.FirstName);
        System.out.println("Фамилия: " + OneStudent.LastName);
        System.out.println("Год обучения: " + OneStudent.yearTeaching);
        StudentTest st2 = new StudentTest();
        st2.Average(OneStudent);

        System.out.println("                       ");
//
//        TwoStudent.numberTicket = 11;
//        TwoStudent.FirstName = "Michael";
//        TwoStudent.LastName = "Medvedkov";
//        TwoStudent.yearTeaching = 2010;
//        TwoStudent.AvergeMath = 4.9;
//        TwoStudent.AvergeEconomy = 5.0;
//        TwoStudent.AvergeInostr = 4.5;
//
//        System.out.println("Номер билета: " + TwoStudent.numberTicket);
//        System.out.println("Имя: " + TwoStudent.FirstName);
//        System.out.println("Фамилия: " + TwoStudent.LastName);
//        System.out.println("Год обучения: " + TwoStudent.yearTeaching);
//        System.out.println("Средняя оценка: " + (TwoStudent.AvergeInostr + TwoStudent.AvergeMath + TwoStudent.AvergeEconomy) / 3);
//
//        System.out.println("                       ");
//
//        ThreeStudent.numberTicket = 14;
//        ThreeStudent.FirstName = "Evgeniy";
//        ThreeStudent.LastName = "Molodtsov";
//        ThreeStudent.yearTeaching = 2008;
//        ThreeStudent.AvergeMath = 4.7;
//        ThreeStudent.AvergeEconomy = 3.0;
//        ThreeStudent.AvergeInostr = 4.5;
//
//
//        System.out.println("Номер билета: " + ThreeStudent.numberTicket);
//        System.out.println("Имя: " + ThreeStudent.FirstName);
//        System.out.println("Фамилия: " + ThreeStudent.LastName);
//        System.out.println("Год обучения: " + ThreeStudent.yearTeaching);
//        System.out.println("Средняя оценка: " + (ThreeStudent.AvergeInostr + ThreeStudent.AvergeMath + ThreeStudent.AvergeEconomy) / 3);
//
//        System.out.println("                       ");
//
//
//        FourStudent.numberTicket = 20;
//        FourStudent.FirstName = "Kirill";
//        FourStudent.LastName = "Gulan";
//        FourStudent.yearTeaching = 2012;
//        FourStudent.AvergeMath = 3.7;
//        FourStudent.AvergeEconomy = 3.0;
//        FourStudent.AvergeInostr = 5.0;
//
//
//        System.out.println("Номер билета: " + FourStudent.numberTicket);
//        System.out.println("Имя: " + FourStudent.FirstName);
//        System.out.println("Фамилия: " + FourStudent.LastName);
//        System.out.println("Год обучения: " + FourStudent.yearTeaching);
//        System.out.println("Средняя оценка: " + (FourStudent.AvergeInostr + ThreeStudent.AvergeMath + ThreeStudent.AvergeEconomy) / 3);


    }
}
