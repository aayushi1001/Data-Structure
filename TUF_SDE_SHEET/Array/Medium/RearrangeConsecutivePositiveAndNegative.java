package TUF_SDE_SHEET.Array.Medium;

import TUF_SDE_SHEET.SortingTechniques.Sorting2.QuickSort;

// This is not in place ans but it arranges perfectly
public class RearrangeConsecutivePositiveAndNegative {
    public static void rearrangeArray(int[] nums) {
        int indexP = 0;
        int i= 0;

        while( i < nums.length) {
            if(nums[i] >=0 ) {
                //indexP is here, move indexP
                if(indexP == i) {
                    indexP += 2;
                    i++;
                }
                //element at it's correct position
                else if(i%2 == 0) {
                    i++;
                }
                //element not at correct position
                else {
                    QuickSort.swap(nums, indexP, i);
                    indexP += 2;
                }
            }
            //in case we find negatives - just move forward
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] prices = new int[]{28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        rearrangeArray(prices);
        for(int i: prices) {
            System.out.println(i);
        }
    }
}
