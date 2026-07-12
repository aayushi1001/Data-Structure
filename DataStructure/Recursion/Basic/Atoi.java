package DataStructure.Recursion;

//https://leetcode.com/problems/string-to-integer-atoi/description/

public class Atoi {
    public static int atoi(String s, int index, int sign, long ans) {
        if(index >= s.length() || !Character.isDigit(s.charAt(index))) {
            return (int)(sign * ans);
        }

        ans = ans * 10 + (s.charAt(index) - '0');

        if(sign * ans >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if(sign * ans <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return atoi(s, index +1, sign, ans);
    }

    public static int myAtoi(String s) {
        int i = 0;

        // skip leading white spaces
        while(i < s.length() && s.charAt(i) == ' ') {
            ++i;
        }

        // determining sign
        int sign = 1;
        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            ++i; // skip sign
        }

        return atoi(s, i, sign, 0);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi(" -1123u3761867")); // -1123
        System.out.println(myAtoi("00000-42a1234"));  // 0
        System.out.println(myAtoi("+23"));          // 23
        System.out.println(myAtoi("+-98"));        // 0
    }
}
