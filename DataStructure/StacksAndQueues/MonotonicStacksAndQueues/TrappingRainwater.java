package DataStructure.StacksAndQueues.MonotonicStacksAndQueues;

import java.util.Stack;

public class TrappingRainwater {
    // Brute Force
    public int trap(int[] height) {
        int ans = 0;

        for(int i=0; i<height.length; ++i) {
            int left = height[i];
            int right = height[i];

            // fetch the biggest left pillar
            for(int j=0; j<i; ++j) {
                if(left < height[j]) {
                    left = height[j];
                }
            }

            // fetch the biggest right pillar
            for(int j=i+1; j<height.length; ++j) {
                if(right < height[j]) {
                    right = height[j];
                }
            }

            ans += Math.min(left, right) - height[i];
        }

        return ans;
    }

    // Monotonic Stack
    public int maxWater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int res = 0;

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                int pop_height = arr[st.pop()];
                if (st.isEmpty()) {
                    // There's no previous greater element
                    break;
                }
                int distance = i - st.peek() - 1;

                int water = Math.min(arr[st.peek()], arr[i]) - pop_height;
                res += distance * water;
            }
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
