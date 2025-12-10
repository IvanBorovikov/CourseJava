package Lesson22;

public class Test3 {
    void salaryUp(Employee e){
        e.salary = e.salary + 100;
    }
    public static void main(String[] args) {

        Doctor doc = new Doctor();
        doc.setName("Иван");
        doc.setAge(22);
        doc.setExperience(2);
        //doc.setSpecialization("Гинеколог");
        System.out.println("Имя: " + doc.getName());
        System.out.println("Возраст: " + doc.getAge());
        System.out.println("Опыт: " + doc.getExperience());
        //System.out.println("Специализация: " + doc.getSpecialization());
    }

}


class Employee {
    double salary = 100;
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    private int age;
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    private int experience;
    public int getExperience(){
        return experience;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }

    void eat(){
        System.out.println("Кушать");
    }
    void sleep(){
        System.out.println("Спать");
    }

}

class Doctor extends Employee{
    private String Specialization;
    public String getSpecialization(){
        return Specialization;
    }

    public void setSpecialization(String specialization){
        this.Specialization = specialization;
    }
    void treat(){
        System.out.println("Лечить");
    }
}


class Surgeon extends Doctor{
    String Scalpel;
    void operation(){

    }

}

class Dentist extends Doctor{

}






class Teacher extends Employee{
    private int countStudents;

    void learn(){
        System.out.println("Учить");
    }
}

class Driver extends Employee{
    private String nameCar;

    void drive(){
        System.out.println("Водить");
    }
}
