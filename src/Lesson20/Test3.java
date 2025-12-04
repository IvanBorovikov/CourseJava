package Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("Good");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++){
            list.get(i).append(" Miki");
        }
        for (StringBuilder sb : list){
            System.out.println(sb + " ");
        }
        list.remove(2);
        list.remove(sb1);
        System.out.println();
        for (StringBuilder sb : list){
            System.out.println(sb + " ");
        }

    }
}
