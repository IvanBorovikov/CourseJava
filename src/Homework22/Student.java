package Homework22;

public class Student {
    private StringBuilder name;
    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name){
        if (name.length() > 3){
            this.name = name;
        }
        else {
            System.out.println("Длина меньше трёх символов");
        }

    }

    private int course;
    public int getCourse(){
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course <= 10){
            this.course = course;
        }
        else {
            System.out.println("Интервал должен быть от 1 до 10");
        }

    }

    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 4){
            this.grade = grade;
        }
        else {
            System.out.println("Интервал должен быть от 1 до 4");
        }

    }

    public void showInfo(){
        System.out.println(getName());
        System.out.println(getCourse());
        System.out.println(getGrade());
    }
}


class StudentTest{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("Ivan"));
        s.setCourse(2);
        s.setGrade(3);
        s.showInfo();
    }
}
