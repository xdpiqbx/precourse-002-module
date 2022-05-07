package main.java.lesson_003_loops;

public class Loops {
    public static void main(String[] args) {
        {
            System.out.println("while");
            int counter = 0;
            while (counter < 5) {
                counter++;
                if (counter == 1){
                    System.out.println("Continue");
                    continue;
                }
                if(counter == 4){
                    System.out.println("Break loop");
                    break;
                }
                System.out.println(counter);
            }
        }
        {
            System.out.println("do ... while");
            int counter = 0;
            do {
                counter++;
                System.out.println(counter);
            } while (false);
        }
        {
            System.out.println("for");
            int[] arr = new int[]{1,2,3,4,5};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        {
            System.out.println("for each");
            int[] arr = new int[]{1,2,3,4,5};
            for (int i : arr) {
                System.out.println(i);
            }
        }
        {
            System.out.println("Matrix");
            int[][] aMatrix = new int[3][2];
            aMatrix[0][0] = 0;
            aMatrix[0][1] = 1;
            aMatrix[1][0] = 2;
            aMatrix[1][1] = 3;
            aMatrix[2][0] = 4;
            aMatrix[2][1] = 5;

            System.out.println("Nice Matrix");
            for (int i = 0; i < aMatrix.length; i++) {
                System.out.print("{");
                for (int j = 0; j < aMatrix[i].length; j++) {
                    System.out.print(aMatrix[i][j] + (j == 0 ? "," : ""));
                }
                System.out.println("}" + (i == aMatrix.length-1 ? "" : ","));
            }

            System.out.println("Matrix values");
            for (int i = 0; i < aMatrix.length; i++) {
                for (int j = 0; j < aMatrix[i].length; j++) {
                    System.out.println(aMatrix[i][j]);
                }
            }

            System.out.println("Matrix values foreach");
            for (int[] i : aMatrix) {
                for (int j : i){
                    System.out.println(j);
                }
            }
        }
    }
}
