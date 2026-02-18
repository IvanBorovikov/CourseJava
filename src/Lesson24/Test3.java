package Lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        System.out.println(h.a);
    }
}

class Employee {
    double salary = 100;
    private String name;
    private int age;
    private int experience;

    void eat(){
        System.out.println("Кушать");
    }
    void sleep(){
        System.out.println("Спать");
    }
}

class Driver extends Employee implements Help_able, Swim_able{
    private String nameCar;

    void drive(){
        System.out.println("Водить");
    }
    public void help(){
        System.out.println("Водитель оказывает помощь");
    }

    public void tushitPojar(String s){
        System.out.println("Водитель тушит пожар с помощью " + s );
    }
    public void swim(){
        System.out.println("Водитель плавает");
    }
}


class Teacher extends Employee implements Help_able{
    private int countStudents;

    void learn(){
        System.out.println("Учить");
    }
    public void help(){
        System.out.println("Учитель оказывает помощь");
    }

    public void tushitPojar(String s){
        System.out.println("Учитель тушит пожар с помощью " + s);
    }
}



interface Help_able{
    void help();
    void tushitPojar(String predmet);
    int a = 10;
}

interface Swim_able{
    void swim();
}
