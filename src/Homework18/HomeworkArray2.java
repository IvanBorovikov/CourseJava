package Homework18;

public class HomeworkArray2 {
    public static void showArray(String [][] arr){
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++){
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++){
                if (j != arr[i].length -1){
                    System.out.print(arr[j][i] + ", ");
                } else {
                    System.out.print(arr[j][i]);
                }

            }
            if (i != arr[i].length -1){
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.println("  }");
    }

    public static void main(String[] args) {
        String array[][] = {{"apple", "orange"}, {"hello", "bye"}};
        showArray(array);

    }
}
