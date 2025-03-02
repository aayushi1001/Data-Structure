package TUF_SDE_SHEET.STEP1.LECTURE4;

public class ReverseIntegers {

    public static int reverse(int x) {
        if(x == 0 || x == Integer.MAX_VALUE) {
            return 0;
        }

        int reversed_num = 0;
        while(x != 0) {
            int last_digit = x%10;
            if(reversed_num > (Integer.MAX_VALUE - Math.abs(last_digit))/10) {
                return 0;
            } else if(reversed_num < (Integer.MIN_VALUE + Math.abs(last_digit))/10) {
                return 0;
            }
            reversed_num = reversed_num*10 + last_digit;
            x=x/10;
        }

        return reversed_num;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123));
    }

}
