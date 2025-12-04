package Homework14;

public class Time {

    public static void HourseMinuteSecond(){
        OUTER: for (int hourse = 0; hourse <= 6; hourse++){

            MIDDLE: for (int minute = 0; minute <= 59; minute++){
                if(hourse > 1 && minute % 10 == 0){
                    break OUTER;
                }
                INNER: for (int second = 0; second <=59; second++){
                    if (second * hourse > minute){
                        continue MIDDLE;
                    }
                    System.out.println(hourse+ ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        Time.HourseMinuteSecond();
    }
}
