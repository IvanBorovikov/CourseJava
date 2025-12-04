package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Privet");
        list1.add("Mike!");
        list1.add(1, "Hello");
        System.out.println(list1);


        for (String s : list1){
            System.out.print(s + " ");
        }
        System.out.println();

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list1.addAll(1, list2);

        list1.clear();


        for (String s : list1){
            System.out.print(s + " ");
        }


    }
}
