package Homework7;

import Lesson6.Employee;

public class EmployeeWork {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;


    public void id() {
        System.out.println(id);
    }


    public void surname() {
        System.out.println(surname);
    }

    public void salary() {
        System.out.println(salary);

    }


    EmployeeWork(String surname1) {
        surname = surname1;
        System.out.println(surname);
    }

    public EmployeeWork(int id2) {
        id = id2;
        System.out.println(id);
    }

    private EmployeeWork(double salary3){

        salary = salary3;
        System.out.println(salary);
    }

    public static void main(String[] args) {
        EmployeeWork emp4 = new EmployeeWork(22.2);
    }




}

class EmployeeWorkTest {
    public static void main(String[] args) {
        EmployeeWork emp1 = new EmployeeWork(1);
        EmployeeWork emp2 = new EmployeeWork("dsds");
//        EmployeeWork emp3 = new EmployeeWork("Volkov", 2, 222.22);
        //System.out.println(emp1.salary());

    }
}
