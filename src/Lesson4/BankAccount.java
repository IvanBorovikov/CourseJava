package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;


    double popolnenieScheta(double schet) {
        balance+=schet;
        return balance;

    }

    double snyatieScheta(double schet) {
        balance-=schet;
        return balance;

    }



}



class BankAccountTest {

    void info (BankAccount showInfo) {
        System.out.println(showInfo.id + " " + showInfo.name + " " + showInfo.balance);

    }

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Ivan";
        MyAccount.balance = 50.5;
        MyAccount.popolnenieScheta(20);
        System.out.println(MyAccount.balance);
        MyAccount.snyatieScheta(0.5);
        System.out.println(MyAccount.balance);

        BankAccountTest str = new BankAccountTest();
        str.info(MyAccount);


        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 12.2;
        YourAccount.popolnenieScheta(20);
        System.out.println(YourAccount.balance);


        BankAccountTest str3 = new BankAccountTest();
        str3.info(YourAccount);


        HisAccount.id = 3;
        HisAccount.name = "Petr";
        HisAccount.balance = 43.5;



        System.out.println();
    }

}