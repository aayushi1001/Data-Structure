package DataStructure.StacksAndQueues.MonotonicStacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        // collision: left -> P and right -> N
        for (int asteroid : asteroids) {
            int right = asteroid;
            while (!stack.isEmpty() && right < 0 && stack.peek() > 0) {
                int left = stack.pop();
                if (left > Math.abs(right)) {
                    // need to push back the left one, right is exploded
                    // next comparison will happen with this new right only
                    // but current loop will break after this point
                    right = left;
                } else if (left == Math.abs(right)) {
                    // no push - both will explode
                    right = 0;
                }
            }

            if (right != 0) {
                stack.push(right);
            }
        }

        int n = stack.size();
        int[] ans = new int[n];
        for(int i=n-1; i>=0; --i) {
            ans[i] = stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{3, 5, -6, 2, -1, 4})));
    }
}
