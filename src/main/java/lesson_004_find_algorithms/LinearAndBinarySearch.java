package main.java.lesson_004_find_algorithms;

public class LinearAndBinarySearch {
    static int counter = 0;

    public static void main(String[] args) {

        int[] array = new int[]{-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};
        int elementToSearch = 7;

        System.out.println(
            "Array length: "+array.length
            +"\n\rElement: "+linearSearch(array, elementToSearch)
            +"\n\rCounter: "+counter
        );
        counter = 0;

        System.out.println(
            "Array length: "+array.length
            +"\n\rElement: "+binarySearch(array, elementToSearch)
            +"\n\rCounter: "+counter
        );
        counter = 0;
    }

    private static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            ++counter;
            if(array[i] == elementToSearch) {
                return array[i];
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int elementToSerch){
        int iLowerArrIndex = 0;
        int iHighArrIndex = array.length;

        while(iLowerArrIndex <= iHighArrIndex){
            ++counter;
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

    private static void sortemNumsForArray() {
        int iArrLength = 10;
        for (int i = 0 - iArrLength; i <= iArrLength; ++i) {
            System.out.print(i+",");
        }
    }
}
