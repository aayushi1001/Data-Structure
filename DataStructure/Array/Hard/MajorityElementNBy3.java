package DataStructure.Array.Hard;

public class MajorityElementNBy3 {

    public static void printMajorityElement(int[] nums) {

        int count1 = 0, count2 = 0;
        int element1 = 0, element2 = 0;

        // find the two majority elements of the array
        for (int i = 0; i < nums.length; i++) {
            if(count1 == 0) {
                element1 = nums[i];
                count1 = 1;
            } else if(nums[i] == element1) {
                count1++;
            } else if(count2 == 0) {
                element2 = nums[i];
                count2 = 1;
            } else if(nums[i] == element2) {
                count2++;
            } else {
                count1 --;
                count2--;
            }
        }

        // verify if their count is greater than n/3
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(element1 == nums[i]) {
                count1++;
            } else if(element2 == nums[i]) {
                count2++;
            }
        }

        int minCount = (int) nums.length/3 +1;
        if(minCount < count1) {
            System.out.println(element1);
        }

        if(minCount < count2) {
            System.out.println(element2);
        }
    }

    public static void main(String[] args) {
        printMajorityElement(new int[]{1,2,3,1,2,2,2});
    }
}
