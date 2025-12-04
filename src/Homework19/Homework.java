package Homework19;

public class Homework {

    public static String[] abc(String[]... array) {
        int length = 0;
        for (String[] array1 : array) {
            length += array1.length;
        }
        String[] outputArray = new String[length];
        int count = 0;
        for (String[] a : array) {
            for (String s : a) {
                outputArray[count] = s;
                count++;
            }
        }
        return outputArray;
    }

    public static void main(String[] args) {
        String[] array = abc(new String[]{"Hi", "Goodbye"}, new String[]{"What", "Where", "When"}, new String[]{"1", "2", "3", "4", "5"});
        int count;
        for (String st : args) {
            count = 0;
            for (String s : array) {
                if (st.equals(array[count])) {
                    array[count] = null;
                }
                count++;
            }
        }
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
