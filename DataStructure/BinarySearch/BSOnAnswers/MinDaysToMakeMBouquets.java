package DataStructure.BinarySearch.BSOnAnswers;

import java.lang.reflect.Array;

public class MinDaysToMakeMBouquets {
    public int preparedBouquets(int[] bloom, int currDay, int flowerCount) {
        int bouquets = 0;
        int count = 0;

        for(int i=0; i<bloom.length; ++i) {
            if(bloom[i] <= currDay) {
                count++;
            } else {
                bouquets = bouquets + count/flowerCount;
                count = 0;
            }
        }

        // had missed this; what will happen to count after loop ends
        bouquets = bouquets + count/flowerCount;
        return bouquets;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if( m*k > n ) {
            return -1;
        }

        int low = bloomDay[0];
        int high = bloomDay[0];

        for(int i=1; i<n; ++i) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            int bouquets = preparedBouquets(bloomDay, mid, k);

            if(bouquets >= m) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        MinDaysToMakeMBouquets a = new MinDaysToMakeMBouquets();
        System.out.println(a.minDays(new int[]{7,7,7,7,12,7,7}, 2, 3));


//        Object[] b = new Object[]{"aayushi", 1, 2};
//        System.out.println(b[1]);
    }
}
