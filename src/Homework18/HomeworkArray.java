package Homework18;

import java.util.Arrays;

public class HomeworkArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5};

        for (int i = 0; i < arr.length - 1; i++) {  // ← тоже важно: -1
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // ОБМЕН ЭЛЕМЕНТОВ - это сортирует массив!
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        // ВЫВОД результата после всей сортировки
        System.out.println(Arrays.toString(arr));
    }


}