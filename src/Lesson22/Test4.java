package Lesson22;

public class Test4 {

}

class HumanTest2 {
    HumanTest2(String n){
        this(n, null);
    }
    HumanTest2(String n, String s){
        name = n;
        name = s;
    }
    String name;
    String surname;
}

class Student2 extends HumanTest2{

    Student2(){
        this(5);
        System.out.println("Hello");
    }

    Student2(int i){
        super("Ivan");

    }
    public static void main(String[] args) {
        Student2 s = new Student2();

    }
}
