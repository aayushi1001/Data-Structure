package DataStructure.Array.Easy;

public class Sort012 {
    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length -1, i=0;

        // for = condition, if it's equal to 0, then the solution will be wrong
        while(i <= two) {
            if(nums[i] == 2) {
                swap(nums, i, two);
                --two;
            } else if(nums[i] == 0) {
                swap(nums, i, zero);
                ++zero;
                ++i;
            } else {
                ++i;
            }
        }

    }
}
