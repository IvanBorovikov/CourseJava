package Homework6;

public class HomeworkStudent {

    HomeworkStudent(int id2, String surname, double salary) {
        this(id2, surname, 0, salary, null);

    }
    HomeworkStudent(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);

    }


    HomeworkStudent(){

    }

    HomeworkStudent(int id1, String surname1, int age1, double salary1, String department1) {
       id = id1;
       surname = surname1;
       age = age1;
       salary = salary1;
       department = department1;
    }



    int id;
    String surname;
    int age;
    double salary;
    String department;
}



class HomeworkStudentTest{
    void showInfo(HomeworkStudent st) {
        System.out.println(st.id + " " + st.surname + " " + st.age + " " + st.salary + " " + st.department);

    }

    public static void main(String[] args) {
        HomeworkStudent h1 = new HomeworkStudent();
        HomeworkStudent h2 = new HomeworkStudent(1, "Ivan", 33.3);
        HomeworkStudent h3 = new HomeworkStudent(2, "Ivan", 22, 23.33, "IT");
        HomeworkStudent h4 = new HomeworkStudent("Ivan", 22);

        h1.id = 1;
        h1.surname = "Kto";
        h1.age = 12;
        h1.salary = 12.2;
        h1.department = "Scholl";


        h2.age = 22;
        h2.department = "medicine";

        HomeworkStudentTest t1 = new HomeworkStudentTest();
        t1.showInfo(h1);
        HomeworkStudentTest t2 = new HomeworkStudentTest();
        t2.showInfo(h2);


        System.out.println(h3.id + " " + h3.surname + " " + h3.age + " " + h3.salary + " " + h3.department);
    }
}