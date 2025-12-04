package Lesson15;

public class Test9 {

    public static void main(String[] args) {
        int hours = -1;

        OUTER:do {
            hours++;
            int minute = 0;
            INNER: while (minute < 60){
                if (minute == 20){
                    continue OUTER;
                }
                System.out.println(hours + ":" + minute);
                minute++;

            }

        }
        while (hours < 24);


    }
}
