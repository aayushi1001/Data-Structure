package DataStructure.BinarySearch.BSOnAnswers;

import java.util.ArrayList;
import java.util.Arrays;

public class AggressiveCows {
    public int getCowsPlacedCount(int[] stalls, int dist) {
        int cowCount = 1; //had initialised with 0; but we are already considering first cow at first stall
        int last = stalls[0];

        for(int i=1; i<stalls.length; ++i) {
            if(stalls[i] - last >= dist) {
                cowCount++;
                last = stalls[i];
            }
        }


        return cowCount;
    }

    public int aggressiveCows(int[] stalls, int k) {
        int mini = stalls[0];
        int maxi = stalls[0];

        for(int i=1; i<stalls.length; ++i) {
            mini = Math.min(mini, stalls[i]);
            maxi = Math.max(maxi, stalls[i]);
        }

        int low = 1, high = maxi - mini;
        int ans = -1;
        Arrays.sort(stalls);

        while(low <= high) {
            int mid = low + (high - low)/2;
            int cowsPlacedCount = getCowsPlacedCount(stalls, mid);

            if(cowsPlacedCount >= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
