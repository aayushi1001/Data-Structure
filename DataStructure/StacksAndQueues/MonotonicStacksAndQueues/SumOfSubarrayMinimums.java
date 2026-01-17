package DataStructure.StacksAndQueues.MonotonicStacksAndQueues;

import java.util.Stack;

public class SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int mod = (int)1e9 + 7;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<=n; ++i) {
            while(!stack.isEmpty() && (i == n || arr[stack.peek()] > arr[i])) {
                int curr = stack.pop();
                int left, right;
                if(stack.isEmpty()) {
                    left = curr + 1;
                } else {
                    left = curr - stack.peek();
                }
                right = i - curr;
                long totalSubarray = (long) left * right;
                int currVal = (int)((totalSubarray * arr[curr])%mod);
                ans = (ans + currVal)%mod;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
