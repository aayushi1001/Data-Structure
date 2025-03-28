package TUF_SDE_SHEET.Array.Medium;
import java.util.Arrays;

public class LongestConsecutiveSequence {

    //Optimal Approach 2
    //Create a set, add all elements
    //Traverse the array, try to find the next element after this.
    //How to optimise
    //If arr[i]-1 is present in the set, this is not the first element of the sequence
    //Start finding sequence only when arr[i]-1

    // consider cases like
    //1. []
    //2. [0]
    //3. [0,1,1,2] - answer should be 3
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) {
            return 0;
        }
        int count = 1, max = 1;

        for(int i=0; i<nums.length-1; ++i) {
            if(nums[i] == nums[i+1]-1) {
                count++;
            } else if(nums[i] == nums[i+1]) {
                continue;
            } else {
                count = 1;
            }

            max = Math.max(count, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1,3,2,4,5};
        System.out.println(longestConsecutive(prices));
    }
}
