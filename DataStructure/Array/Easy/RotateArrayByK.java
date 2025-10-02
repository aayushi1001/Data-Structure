package DataStructure.Array.Easy;

public class RotateArrayByK {

    // Ask: Can k be greater than arr.length
    // If yes: n = 7
    // Rotating 7 times means no rotation
    // Rotating 8 times means 1 rotation

    // 1,2,3,4,5,6,7 -> 5,6,7,1,2,3,4
    // n=7 k=3
    // i = n-k-1 ; i+k
    //Brute Force
    public static void rotateArray(int arr[], int k) {

        int n = arr.length;
        k = k%n;

        int[] temp = new int[k];
        for(int i=n-k; i<n; ++i) {
            temp[i-k-1] = arr[i];
        }

        for(int i=n-k-1; i>=0; --i) {
            arr[i+k] = arr[i];
        }

        for(int i=0; i<k; ++i) {
            arr[i] = temp[i];
        }
    }

   // Method to reverse array between two indices
    public static void reverse(int[] arr, int l, int h) {
        while(l<h) {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            ++l;
            --h;
        }
    }

    // Optimised
    // 1,2,3,4,7,6,5 - Reverse n-k to n
    // 4,3,2,1,7,6,5 - Reverse 0 to n-k
    // 5,6,7,1,2,3,4 - Reverse 0 to n

    public static void rotateArray1(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums, n-k, n -1);
        reverse(nums, 0, n-k-1);
        reverse(nums, 0, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateArray(arr, 3);
        rotateArray1(arr, 3);
        for(int i: arr) {
            System.out.println(i);
        }
    }
}
