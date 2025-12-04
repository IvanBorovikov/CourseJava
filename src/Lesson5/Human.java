package Lesson5;

public class Human {
    String name;
    Car3 car2;
    BankAccount bA;

    void showInfo(){
        System.out.println("Имя: " + name + " Цвет машины: " + car2.color + " Баланс банковского счёта: " + bA.balance);
    }
}



class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Ivan";
        h.car2 = new Car3("Red", "V8");
        h.bA = new BankAccount(2, 24.4);
        h.showInfo();
    }
}



class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;

    }
    String color;
    String engine;

}


class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }


    int id;
    double balance;
}