package Lesson6;

public class Employee {
     Employee(int id2, String surname2, int age2){
        this(id2, surname2, age2, 0.0, null, false);

    }


     public Employee(String surname3, int age3) {
         this(0, surname3, age3, 0.0, null, false);

    }

    Employee(boolean surname5, int age3) {
        this(0, null, age3, 0.0, null, surname5);

    }

     Employee(int id4, String surname4, int age4, double salary4, String department4, boolean b1) {
         id = id4;
         surname = surname4;
         age = age4;
         salary = salary4;
         department = department4;
         b = b1;
    }


    int id;
    String surname;
    int age;
    double salary;
    String department;
    boolean b;

}


class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Ivanov", 25);
        System.out.println(emp.id);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.surname);
        Employee emp3 = new Employee(2, "Sidorov", 33, 22.44, "Develeper", true);
        System.out.println(emp3.department);
        Employee emp4 = new Employee(true, 3);
        System.out.println(emp4);

    }
}