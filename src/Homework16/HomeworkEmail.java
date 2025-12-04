package Homework16;

public class HomeworkEmail {

    public static char c1;

    public static void email(String InEmail){
        for (int i = 0; i < InEmail.length(); i++){
            c1 = InEmail.charAt(i);
            if (c1 == '@'){
                System.out.println(InEmail.substring(i + 1, InEmail.indexOf('.')));
            }
        }
    }

}


class HomeworkEmailTest{
    public static void main(String[] args) {
        String str = "ya@yahoo.com; on@mail.ru; ona@gmail.com";
        HomeworkEmail.email(str);
    }
}