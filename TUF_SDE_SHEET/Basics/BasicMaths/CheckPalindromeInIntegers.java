package TUF_SDE_SHEET.Basics.BasicMaths;

public class CheckPalindromeInIntegers {

    // We don't need to check the boundary condition because if x is in the range,
    // it's palindrome will also be x. So, it will automatically be in the range of integers.
    public static int getReverse(int x) {
        int reversed = 0;

        while(x != 0) {
            int last_digit = x%10;
            reversed = reversed * 10 + last_digit;
            x = x/10;
        }

        return reversed;
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        return x == getReverse(x);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }
}
