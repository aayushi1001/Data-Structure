package DataStructure.BinarySearch.BSOnAnswers;

// Further optimisation -
// totalMissing and return value - mathematical simplification (high + k + 1)
// missingCount and ans - mathematical simplification

// Strategy - line no. 17 - we are returning high + k + 1
// What is high? missing number lies after this
// If we find such index in normal array also such that missing number lies bw high and high + 1
// we can return high + k + 1

public class KthMissingNumber {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length -1 ;

        // missed this; what if nothing is missing or missing count is less than k
        int totalMissing = arr[high] - high - 1;
        if(totalMissing < k) {
            // k + high + 1
            return arr[high] + k - arr[high] + high + 1;
        }

        int ans = -1;
        while(low <= high) {
            int index = low + (high - low)/2;
            int missingCount = arr[index] - index - 1;

            if(missingCount >= k) {
                ans = arr[index] - (missingCount - k) - 1;
                high = index - 1;
            } else {
                low = index + 1;
            }
        }

        return ans;
    }

    public int optimised(int[] arr, int k) {
        int low = 0, high = arr.length -1 ;
        while(low <= high) {
            int index = low + (high - low)/2;
            int missingCount = arr[index] - index - 1;

            if(missingCount >= k) {
                high = index - 1;
            } else {
                low = index + 1;
            }
        }

        return high + k + 1;
    }

    public static void main(String[] args) {

    }
}
