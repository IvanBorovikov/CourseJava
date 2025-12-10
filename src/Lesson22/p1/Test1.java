package Lesson22.p1;

import Lesson22.Human;
public class Test1 {
    public static void main(String[] args) {
        Human h2 = new Human("Male");
        h2.setName(new StringBuilder("Nikolai"));
        h2.setAge(28);
        h2.setWeight(77);

        System.out.println(h2.getName());
        System.out.println(h2.getAge());
        System.out.println(h2.getWeight());
    }
}
