package TUF_SDE_SHEET.Basics.Recursion;

public class checkPalindrome {
    public static boolean checkStringPalindrome(String n, int start) {
        int end = n.length() - start - 1;
        if(start < end) {
            if(n.charAt(start) == n.charAt(end)) {
                checkStringPalindrome(n, start +1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean checkStringPalindrome1(String n, int start) {
        int end = n.length() - start - 1;
        if(start >= end) {
            return true;
        }

        if(n.charAt(start) != n.charAt(end)) {
            return false;
        }

        return checkStringPalindrome1(n, start +1);
    }

    public static void main(String[] args) {
        String a = "abcba";
        System.out.println(checkStringPalindrome(a, 0));
        System.out.println(checkStringPalindrome1(a,0));
    }
}
