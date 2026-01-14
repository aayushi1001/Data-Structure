package DataStructure.BinarySearch.BSOnAnswers;

public class KokoEatingBananas {

    // Return the `minimum integer k` such that she can eat all the bananas within h hours.

    public static int calculateHours(int[] piles, int n) {
        int hrs = 0;

        for (int pile : piles) {
            hrs += (int) Math.ceil((double) pile / n);
        }

        return hrs;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int high = piles[0];
        int low = 1;
        int ans = -1;

        for(int i=1; i<piles.length; ++i) {
            if(piles[i] > high) {
                high = piles[i];
            }
        }

        while(low <= high) {
            // number of bananas she has to eat in one hour
            int mid = low + (high - low)/2;

            // total number of hours if she eats "mid" bananas
            int hours = calculateHours(piles, mid);

            if(hours <= h) {
                // she can eat less
                ans = mid;
                high = mid - 1;
            } else {
                // she needs to eat more
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{10}, 8));
        System.out.println(minEatingSpeed(new int[]{88,61,90,94,67}, 6));
        System.out.println(minEatingSpeed(new int[]{30,11,23,4,20}, 5));
    }

}
