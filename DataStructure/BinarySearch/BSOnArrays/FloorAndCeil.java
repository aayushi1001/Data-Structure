package DataStructure.BinarySearch.BSOnArrays;

public class FloorAndCeil {

    // just smaller or equal
    public static int getFloor(int[] nums, int k) {
        int l = 0, h = nums.length - 1;
        int ans = -1;

        while(l <= h) {
            int mid = l + (h - l)/2;
            if(nums[mid] <= k) {
                ans = nums[mid];
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return ans;
    }

    // just greater or equal
    public static int getCeil(int[] nums, int k) {
        int l = 0, h = nums.length - 1;
        int ans = -1;

        while(l <= h) {
            int mid = l + (h - l)/2;
            if(nums[mid] >= k) {
                ans = nums[mid];
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getFloor(new int[] {1,2,3,3,5,6}, 2));
        System.out.println(getCeil(new int[] {1,2,3,3,5,6}, 3));
    }
}
