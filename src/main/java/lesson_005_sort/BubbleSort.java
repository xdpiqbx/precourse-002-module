package main.java.lesson_005_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = new int[]{0, -2, 10, 4, -4, 1, -5, 9, 8, -1, 2, -3};
        bubbleSort(array);
        System.out.println(
            Arrays.toString(array)
        );
    }
    
    private static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
