package DataStructure.Array.Medium;

//1 1 1
//0 1 1
//1 1 1

public class SetMatrixZeroBest {
    public static void setZeroes(int[][] arr) {
        int col = -1;

        // The loop should start from 0, otherwise the lookup arrays will get manipulated by its successor elements,
        // and it would give wrong result for themselves
        for(int i=0; i<arr.length; ++i) {
            for(int j=0; j<arr[0].length; ++j) {
                if(arr[i][j] == 0) {
                    if(j == 0) {
                        col = 0;
                    } else {
                        arr[0][j] = 0;
                        arr[i][0] = 0;
                    }
                }
            }
        }

        for(int i=arr.length -1; i>=0; --i) {
            for(int j=arr[0].length -1; j>=0; --j) {
                // (j==0 && col == 0) --- don't do this, it will fail in your second test case
                if(j == 0) {
                    if(col == 0) {
                        arr[i][j] = 0;
                    }
                }
                // it should be else if not another if
                else if(arr[0][j] == 0 || arr[i][0] == 0) {

                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1}, {1,0,1}, {1,1,1}};
        int[][] arr1 = {{-4,-2147483648,6,-7,0},{-8,6,-8,-6,0},{2147483647,2,-9,-6,-10}};
        setZeroes(arr);
        for(int i=0; i<arr.length; ++i) {
            for(int j=0; j<arr.length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
