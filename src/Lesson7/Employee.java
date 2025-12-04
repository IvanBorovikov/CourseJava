package Lesson7;

public class Employee {
     public double salary;

    public void dvoynayZP(){
        double res =  salary * 2;
        System.out.println("Двойная зп: " + res);

    }

    public Employee(double salary2) {
        salary = salary2;

    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayZP();

    }
}


class EmployeeTest {
    public static void main(String[] args) {
        Employee s1 = new Employee(1000);
        System.out.println(s1.salary);
        s1.dvoynayZP();
    }
}
