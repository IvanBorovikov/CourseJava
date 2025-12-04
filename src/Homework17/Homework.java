package Homework17;

public class Homework {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        if(sb1.length() == sb2.length()){
            for (int i = 0; i < sb1.length(); i++){
                if (sb1.charAt(i) != sb2.charAt(i)){
                    return false;

                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("Hrello");
        StringBuilder sb4 = new StringBuilder("Hello");
        System.out.println(ravenstvo(sb3, sb4));
    }

}


