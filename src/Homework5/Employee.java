package Homework5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;


    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;

    }

    void info() {
        System.out.println("id: " + id + " Имя: " + surname + " Возраст: " + age + " Зарплата: " + salary + " Должность: " + department);
    }


    double zarplata() {
        salary += salary;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee s1 = new Employee(2, "Ivan", 22, 224.32, "devel");
        Employee s2 = new Employee(2, "Petr", 32, 200.32, "dising");
        s1.info();
        s1.zarplata();
        s1.info();
        s2.info();
        s2.zarplata();
        s2.info();

    };

}
