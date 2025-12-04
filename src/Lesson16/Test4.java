package Lesson16;

public class Test4 {
}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;

    }
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(100.5, true);
      //  System.out.println(emp1.isManager + emp1.salary);
    }
}
