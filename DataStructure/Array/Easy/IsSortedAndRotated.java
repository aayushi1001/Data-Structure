package TUF_SDE_SHEET.Array.Easy;

//Before reaching to this solution
//Take the other step
// Find the min element and right which everything should be sorted, left of which everything should be sorted
// Then take this example
// 2,1,3,4 - min_index = 1
// Everything after and before min_index is sorted, but it's not rotated because
// first element has to be greater than last one here for this array to be rotated.
// Then come to this

public class IsSortedAndRotated {

    public boolean check(int[] nums) {
        int dip = 0, dip_index = -1;

        for(int i=1; i<nums.length; ++i) {
            if(nums[i-1] > nums[i]) {
                dip++;
                dip_index = i;
            }
        }

        // There should be only one dip
        if(dip == 0) {
            return true;
        }

        // If only one dip is present, last element should be smaller than equal to the first element
        if(dip == 1) {
            if(dip_index != 0 && nums[nums.length -1] <= nums[0]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }

}
