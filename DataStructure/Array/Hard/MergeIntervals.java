package DataStructure.Array.Hard;


import java.util.*;

// Assume an array of video watch times, where each segment represents the
// times a user started and stopped a video, calculate the total number of unique minutes watched
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> ans = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ans.add(intervals[0]);
        for(int i=1; i<intervals.length; ++i) {
            int[] last = ans.getLast();
            if(last[1] >= intervals[i][0]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                ans.add(intervals[i]);
            }
        }

        return ans.toArray(new int[ans.size()][]);

    }
    public static void main(String[] args) {

    }
}
