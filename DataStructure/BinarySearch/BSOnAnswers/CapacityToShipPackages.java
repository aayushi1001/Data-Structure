package DataStructure.BinarySearch.BSOnAnswers;

public class CapacityToShipPackages {
    public int getDaysRequired(int capacity, int[] weights) {
        int days = 1; // this was wrong earlier; had initialised with 0
        int sum = 0;
        for(int i=0; i<weights.length; ++i) {
            if(sum + weights[i] <= capacity) {
                sum += weights[i];
            } else {
                days++;
                sum = weights[i];
            }
        }

        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0];
        int high = weights[0];
        int ans = -1;

        for(int i=1; i<weights.length; ++i) {
            low = Math.max(low, weights[i]);
            high = high + weights[i];
        }

        while(low <= high) {
            int currCapacity = low + (high - low)/2;
            int daysRequired = getDaysRequired(currCapacity, weights);

            if(daysRequired <= days) {
                ans = currCapacity;
                high = currCapacity - 1;
            } else {
                low = currCapacity + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
