package TUF_SDE_SHEET.Array.Medium;

public class MaximumSubarraySum {

    // Print the subarray with maximum sum
    public static void printSubarray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        int start = 0, ansStart =-1, ansEnd = -1;

        for(int i=0; i<nums.length; ++i) {
            sum += nums[i];

            if(sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0) {
                sum = 0;
                start = i+1;
            }
        }

        for(int i=ansStart; i<=ansEnd; ++i) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; ++i) {
            sum += nums[i];

            if(sum > max) {
                max = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] arr1 = new int[]{1};
        int[] arr2 = new int[]{5,4,-1,7,8};
        printSubarray(arr);
        printSubarray(arr1);
        printSubarray(arr2);
    }
}
