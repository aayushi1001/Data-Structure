package DataStructure.Array.Medium;

public class NextPermutation {
    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

    }

    public static void reverse(int[] nums, int low, int high) {
        while(high > low) {
            swap(nums, low, high);
            ++low;
            --high;
        }
    }

    public static void nextPermutation(int[] nums) {
        //nodal point index
        int nodal_pt = -1;

        for(int i=nums.length-1; i>0; --i) {
            if(nums[i] > nums[i-1]) {
                nodal_pt = i-1;
                break;
            }
        }

        if(nodal_pt == -1) {
            reverse(nums, 0, nums.length -1);
        } else {
            // finding the element which is greater than nodal element and smallest in the decreasing array
            for(int i=nums.length-1; i>nodal_pt; --i) {
                if(nums[i] > nums[nodal_pt]) {
                    // right array is in decreasing order
                    // first found (from back) will be the smallest
                    swap(nums, nodal_pt, i);
                    break;
                }
            }

            reverse(nums, nodal_pt +1, nums.length -1);
        }
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1,3,2,4,5};
        nextPermutation(prices);
        for(int i: prices) {
            System.out.println(i);
        }
    }
}
