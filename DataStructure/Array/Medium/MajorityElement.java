package TUF_SDE_SHEET.Array.Medium;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0, element = nums[0];

        for(int i=0; i<nums.length; ++i) {
            if(nums[i] == element) {
                count++;
            } else if(count != 0) {
                count--;
            } else {
                element = nums[i];
                count = 1;
            }
        }

        return element;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,4,3,3,1,2,6}));
    }
}
