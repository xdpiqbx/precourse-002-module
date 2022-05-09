package main.java.lesson_001_from_procedural_to_oop;

public class ProceduralStyle {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{20, 31, -19, 40, -12, -5, 42, -99, 7, 6, -43, 50};
        int elementToSearch = 42;
        int element = sortAndFindElement(unsortedArray, elementToSearch);
        System.out.println("Result: " + element);
    }

    public static int sortAndFindElement(int[] array, int elementToSearch){

        // bubble sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // binary search
        int iLowerArrIndex = 0;
        int iHighArrIndex = array.length;

        while(iLowerArrIndex <= iHighArrIndex){
            int iMiddleIndex = (iLowerArrIndex + iHighArrIndex) / 2;
            int iMiddleElement = array[iMiddleIndex];

            if(iMiddleElement < elementToSearch){
                iLowerArrIndex = iMiddleIndex + 1;
            }else if(iMiddleElement > elementToSearch){
                iHighArrIndex = iMiddleIndex - 1;
            }else{
                return iMiddleElement;
            }
        }

        return -1;
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

    private static int binarySearch(int[] array, int elementToSerch){
        int iLowerArrIndex = 0;
        int iHighArrIndex = array.length;

        while(iLowerArrIndex <= iHighArrIndex){
            int iMiddleIndex = (iLowerArrIndex + iHighArrIndex) / 2;
            int iMiddleElement = array[iMiddleIndex];

            if(iMiddleElement < elementToSerch){
                iLowerArrIndex = iMiddleIndex + 1;
            }else if(iMiddleElement > elementToSerch){
                iHighArrIndex = iMiddleIndex - 1;
            }else{
                return iMiddleElement;
            }
        }
        return -1;
    }
}
