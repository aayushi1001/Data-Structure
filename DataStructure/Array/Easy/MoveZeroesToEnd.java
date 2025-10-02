package DataStructure.Array.Easy;

import java.util.ArrayList;

public class MoveZeroesToEnd {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void moveZeroes(int[] nums) {
        int zero_index = -1;

        for(int i=0; i<nums.length; ++i) {
            if(zero_index == -1) {
                if(nums[i] == 0) {
                    zero_index = i;
                }
            } else if(nums[i] != 0) {
                swap(nums, i, zero_index);
                zero_index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        moveZeroes(arr);
        for(int i: arr) {
            System.out.println(i);
        }

        ArrayList<Integer> a = new ArrayList<>(10);
        a.add(12);
        if(a.get(0) > 10) {
            System.out.println("yes");
        }
    }
}
