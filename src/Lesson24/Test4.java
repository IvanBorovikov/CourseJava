package Lesson24;

public class Test4 {
    Jumpable j1 = new Human();
    Jumpable j2 = new Animal();
}

class Human implements Jumpable{public void jump(){}}

class Animal implements Jumpable{public void jump(){}}

interface Jumpable{void jump();}
interface A2{void abc();}
interface B2 extends A2, Jumpable{void def();}

