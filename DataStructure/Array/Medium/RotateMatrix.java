package TUF_SDE_SHEET.Array.Medium;

public class RotateMatrix {
    //1 2 3
    //4 5 6
    //7 8 9

    // Index placement
    // 0 0 -> 0 2
    // 0 1 -> 1 2
    // 0 2 -> 2 2

    // 1 0 -> 0 1
    // 1 1 -> 1 1
    // 1 2 -> 2 1


    public static int[][] rotate(int[][] arr) {
        int n = arr.length;
        int[][] ans = new int[n][n];

        for(int i=0; i<n; ++i) {
            for(int j=0; j<n; ++j) {
                ans[j][n-1-i] = arr[i][j];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        arr = rotate(arr);
        for(int i=0; i<arr.length; ++i) {
            for(int j=0; j<arr.length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
