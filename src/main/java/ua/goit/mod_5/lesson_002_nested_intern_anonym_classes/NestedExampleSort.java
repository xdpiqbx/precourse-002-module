package ua.goit.mod_5.lesson_002_nested_intern_anonym_classes;

import java.util.Arrays;

public class NestedExampleSort {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{20, 31, -19, 40, -12, -5, 42, -99, 7, 6, -43, 50};
        int[] sortedArray = SortUtil.sortIntArray(
            Arrays.copyOf(unsortedArray, unsortedArray.length - 1)
        );
        System.out.println(Arrays.toString(sortedArray));
    }

    static class SortUtil{
        public static int[] sortIntArray(int[] array){
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if(array[j] > array[j + 1]){
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            return array;
        }
    }
}
