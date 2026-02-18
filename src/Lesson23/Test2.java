package Lesson23;

import javax.print.Doc;

public class Test2 {

//    public Doctor abc(){
//        return new Surgeon();
//    }


    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();
//        Surgeon s = new Surgeon();

        Employee eml = new Doctor();
        System.out.println(eml.salary);
        System.out.println(eml.name);
        System.out.println(eml.age);
        System.out.println(eml.experience);
        eml.eat();
        eml.sleep();
        //eml.treat();

        Employee eml2 = new Teacher();
        Employee eml3 = new Driver();


        Doctor d2 = new Surgeon();
        System.out.println(d2.experience);
        d2.eat();
        d2.sleep();
        d2.treat();
        Employee eml4 = new Surgeon();


    }
}

class Employee {
    double salary = 100;
    String name;
    int experience;
    int age;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

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

class Doctor extends Employee {
    private String Specialization;
    public String getSpecialization(){
        return Specialization;
    }

    public void setSpecialization(String specialization){
        this.Specialization = specialization;
    }
    public void treat(){
        System.out.println("Лечить");
    }
}

class Surgeon extends Doctor {
    String Scalpel;
    void operation(){

    }

}

class Teacher extends Employee {
    private int countStudents;

    void learn(){
        System.out.println("Учить");
    }
}

class Driver extends Employee {
    private String nameCar;

    void drive(){
        System.out.println("Водить");
    }
}

