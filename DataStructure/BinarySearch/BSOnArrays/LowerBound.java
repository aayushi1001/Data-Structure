package DataStructure.BinarySearch.BSOnArrays;

public class LowerBound {

    // smallest index where arr[i] >= n
    public static int getLowerBound(int[] nums, int n) {
        int ans = -1;
        int l = 0, h = nums.length -1;

        while(l <= h) {
            int mid = l + (h - l)/2;
            if(nums[mid] >= n) {
                ans = mid;
                h = mid -1;
            } else {
                l = mid +1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getLowerBound(new int[]{3,5,8,15,19}, 20));
    }
}
