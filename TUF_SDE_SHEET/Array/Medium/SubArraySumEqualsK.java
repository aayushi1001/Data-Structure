package TUF_SDE_SHEET.Array.Medium;

import java.util.*;

public class SubArraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0; i<n; ++i) {

            sum += nums[i];

            if(map.containsKey(sum - k)) {
                int currCount = map.get(sum - k);
                count += currCount;
            }

            if(map.containsKey(sum)) {
                int currCount = map.get(sum);
                map.replace(sum, currCount+1);
            } else {
                map.put(sum,1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        System.out.println(subarraySum(arr, k));


        ArrayList<ArrayList<Integer>> pas = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();

        List<List<Integer>> b = new ArrayList<>();

    }
}
