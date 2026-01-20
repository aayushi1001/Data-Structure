package DataStructure.DailyQuestions.BitManipulation;

public class FindTheNumberAppearingOnce {

    // All integers appear thrice except one. Find the integer that appears once.

    public int findSingleNumber(int[] nums) {
        int result = 0;

        for (int i=0; i<32; ++i) {
            int count = 0;

            // check in each number if ith bit is set or not
            // count for how many numbers it is set
            for(int num: nums) {
                // checks if ith bit is set
                if((num & (1 << i)) != 0) {
                    count++;
                }
            }

            // If single number ith bit is not set, the count will be in multiple of 3
            if(count%3 != 0) {
                // turning on ith bit in result
                result |= (1 << i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
