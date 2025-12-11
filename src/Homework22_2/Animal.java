package Homework22_2;

public class Animal {
    Animal(){
        System.out.println("I am animal.");
    }

    private int eyes;

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void eat(){
        System.out.println("Animal eats");
    }

    public void drink(){
        System.out.println("Animal drinks");
    }
}


class Pet extends Animal{
    Pet(){
        System.out.println("I am pet");
        setEyes(2);
    }
    protected String name;
    protected int tail = 1;
    protected int paw = 4;

    public void run(){
        System.out.println("Pet runs");
    }

    public void jump(){
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet{
    Dog(String name){
        this.name = name;
        System.out.println("I am dog and my name is: " + name);

    }
    public void play(){
        System.out.println("Dog plays");
    }
}


class Cat extends Pet{
    Cat(String name){
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    }

    public void sleep(){
        System.out.println("Cat sleeps");
    }
}


class Test{
    public static void main(String[] args) {
        Dog dog = new Dog("Bim");
        System.out.println("Кол-во лап: " + dog.paw);

        Cat cat = new Cat("Murka");
        cat.sleep();

    }
}

