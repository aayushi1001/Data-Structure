package TUF_SDE_SHEET.Array.Medium;

import java.util.*;

public class SpiralMatrix {

    //1 2 3
    //4 5 6
    //7 8 9
    // 1 2 3 6 9 8 7 4 5

    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length -1, left = 0, right = matrix[0].length-1;
        ArrayList<Integer> ans = new ArrayList<>();

        while(top <= bottom && left <= right) {

            //left to right
            for(int i=left; i<=right; ++i) {
                ans.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            for(int i=top; i<=bottom; ++i) {
                ans.add(matrix[i][right]);
            }
            right--;

            //right to left
            //focus on this condition -
            //Even though right>= left here, but we cannot move forward with this loop as it will print same numbers again
            //that we printed in left to right
            if(top<=bottom) {
                for(int i=right; i>=left; --i) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom to top
            //focus on this condition
            if(left<=right) {
                for(int i=bottom; i>=top; --i) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        List<Integer> list = spiralOrder(arr);
        for(Integer i: list) {
            System.out.print(i + " ");
        }
    }
}
