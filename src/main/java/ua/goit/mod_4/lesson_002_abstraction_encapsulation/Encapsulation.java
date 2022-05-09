package ua.goit.mod_4.lesson_002_abstraction_encapsulation;

public class Encapsulation {
    public int findIntElement(int[] array, int elementToSerch){
        int iLowerArrIndex = 0;
        int iHighArrIndex = array.length;
        int iMiddleElement = getMiddleElement(array, elementToSerch, iLowerArrIndex, iHighArrIndex);
        return iMiddleElement;
    }

    private int getMiddleElement(int[] array, int elementToSerch, int iLowerArrIndex, int iHighArrIndex) {
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