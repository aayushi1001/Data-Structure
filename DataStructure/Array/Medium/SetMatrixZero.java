package DataStructure.Array.Medium;

//1 1 1
//0 1 1
//1 1 1

// row = 1 col = 0

import java.util.Arrays;

public class SetMatrixZero {

    public static void setZero(int[][] arr, int row, int col) {
        for(int i=0; i<arr.length; ++i) {
            arr[i][col] = 0;
        }

        for(int i=0; i<arr.length; ++i) {
            arr[row][i] = 0;
        }
    }

    public static void setZeroInMatrix(int[][] arr) {

        //Create a duplicate lookup matrix
        int[][] copy = Arrays.copyOf(arr, arr.length); // Copy outer array
        for (int i = 0; i < arr.length; i++) {
            copy[i] = Arrays.copyOf(arr[i], arr[i].length); // Copy inner arrays
        }

        for(int i=0; i<arr.length; ++i) {
            for(int j=0; j<arr.length; ++j) {
                if(copy[i][j] == 0) {
                    setZero(arr, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1}, {1,0,1}, {1,1,1}};
        setZeroInMatrix(arr);
        for(int i=0; i<arr.length; ++i) {
            for(int j=0; j<arr.length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
