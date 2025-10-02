package TUF_SDE_SHEET.Array.Easy;

import java.sql.SQLOutput;
import java.util.HashMap;

public class LongestSubarraySum {

    // positive + negative
    public int longestSubarray(int[] arr, int k) {
        // Long: sum till an index i
        // Integer: the index i
        HashMap<Long, Integer> prefixMap = new HashMap<>();
        int length = 0;
        long sum = 0;

        for(int i=0; i<arr.length; ++i) {
            sum += arr[i];

            if(sum == k) {
                length = Math.max(i+1, length);
            }

            if(prefixMap.containsKey(sum - k)) {
                int len = i - prefixMap.get(sum -k);
                length = Math.max(len, length);
            }

            if(!prefixMap.containsKey(sum)) {
                prefixMap.put(sum, i);
            }
        }

        return length;
    }

    // Works for only positives and zeros
    // We assume here that the array sum keeps increasing and it's not possible with negatives in it.
    public static int getLongestSubarrayLength2(int[] arr, int k) {
        int length = 0, sum=0;

        int i=0;

        for(int j=0; j<arr.length; ++j) {
            sum += arr[j];

            while(sum > k) {
                sum -= arr[i];
                i++;
            }

            if(sum == k) {
                length = Math.max(length, j-i+1);
            }

        }

        return length;
    }

    public static int getLongestSubarrayLength1(int[] arr, int k) {
        int length = 0;

        for(int i=0; i<arr.length; ++i) {  // starting point
            int sum = 0;
            for(int j=i; j<arr.length; ++j) { // We will consider all sizes from a particular starting point
                sum = sum + arr[j];
                if(sum == k && length < j-i +1) {
                    length = j-i +1;
                }
            }
        }

        return length;
    }

    public static int getLongestSubarrayLength(int[] arr, int k) {
        int length = 0;
        for(int size = 1; size <=arr.length; ++size) {

            // Note - condition is "<="
            for(int start_index = 0; start_index <= arr.length - size; ++start_index) {
                int sum = 0;

                // loop to find the sum of subarray of the given size
                for(int i= start_index; i< start_index + size; ++i) {
                    sum = sum + arr[i];
                }
                if(sum == k && length < size) {
                    length = size;
                    // once we have found the subarray of length size,
                    // we can move to another size rather than checking more sub-arrays of same size
                    break;
                }
            }
        }

        return length;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2,0,0,3};
        System.out.println(getLongestSubarrayLength(arr, 3));
        System.out.println(getLongestSubarrayLength1(arr, 3));
        System.out.println(getLongestSubarrayLength2(arr, 3));
    }
}
