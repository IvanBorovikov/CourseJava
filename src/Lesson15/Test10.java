package Lesson15;

public class Test10 {
    public static void main(String[] args) {
        OUTER:
        for (int horse = 0; horse <24; horse++){
            int minute = 0;
            INNER:
            while (minute < 60){
                System.out.println(horse + ":" + minute);
                minute++;
            }
        }
    }
}
