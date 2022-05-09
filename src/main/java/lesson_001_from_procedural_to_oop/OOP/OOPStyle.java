package main.java.lesson_001_from_procedural_to_oop.OOP;

import java.util.Arrays;

public class OOPStyle {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{20, 31, -19, 40, -12, -5, 42, -99, 7, 6, -43, 50};
        SortUtil sort = new SortUtil();
        SearchUtil search = new SearchUtil();
        int[] sortedArray = sort.sortIntArray(
            Arrays.copyOf(unsortedArray, unsortedArray.length - 1)
        );
        int result = search.findIntElement(sortedArray,42);
        System.out.println("Element: " + result);
    }
}
