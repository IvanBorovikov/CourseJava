package Homework20;

import Lesson7.A;

import java.util.ArrayList;
import java.util.Collections;

public class Homework {
    
    public static ArrayList<String> abc (String ... str) {
        ArrayList <String> list1 = new ArrayList<>();
        for (String s : str){
            if (!list1.contains(s)){
                list1.add(s);
            }
        }
        Collections.sort(list1);


        return list1;
    }

    public static void main(String[] args) {
        ArrayList <String> list = abc("Привет", "Привет", "Кто ты", "Кто", "Думал", "Кто");
        for (String s1 : list){
            System.out.println(s1 + " ");
        }
    }
}
