package ua.goit.mod_4.lesson_001_from_procedural_to_oop.OOP;

public class SearchUtil {
    public int findIntElement(int[] array, int elementToSerch){
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
