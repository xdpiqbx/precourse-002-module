package main.java.lesson_002_arrays_matrix;

import java.util.Arrays;

public class ArrayMatrix {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 5;

        System.out.println(array.toString()); // [I@1b28cdfa
        System.out.println(Arrays.toString(array)); // [1, 2, 3]

        int[] aNewArray = Arrays.copyOf(array, 5);
        aNewArray[3] = 4;
        System.out.println(Arrays.toString(aNewArray)); // [1, 2, 3, 4]

        System.out.println(
            Arrays.compare(array, aNewArray)
                // num  =>  array > aNewArray
                // 0    =>  array == aNewArray
                // -num =>  array < aNewArray
        );

        String[] cars = {"Camaro", "Corvette", "Tesla"}; // same data type

        // -------------------------------------------------------------

        int[][] aMatrix = new int[3][2];
        aMatrix[0][0] = 0;
        aMatrix[0][1] = 1;
        aMatrix[1][0] = 2;
        aMatrix[1][1] = 3;
        aMatrix[2][0] = 4;
        aMatrix[2][1] = 5;

    }
}
