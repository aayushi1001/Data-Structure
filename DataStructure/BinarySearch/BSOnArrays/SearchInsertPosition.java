package DataStructure.BinarySearch.BSOnArrays;

public class SearchInsertPosition {

    public static int getSearchPosition(int[] nums, int n) {
        // if it's not found and a greater element than this is
        // also not found that means it should lie at the end of the array
        int ans = nums.length;

        int l=0, h=nums.length -1;
        while(l<=h) {
            int mid = l + (h - l)/2;
            if(nums[mid] == n) {
                ans = mid;
                break;
            } else if(nums[mid] > n) {
                ans = mid;
                h = mid -1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getSearchPosition(new int[]{1,3,5,6}, 7));
    }
}
