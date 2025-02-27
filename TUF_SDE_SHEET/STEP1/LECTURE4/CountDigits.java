package TUF_SDE_SHEET.STEP1.LECTURE4;

public class CountDigits {

    // In problems related to division/modulo, also take care of 0 condition

    static int evenlyDivides(int n) {
        int count = 0;
        int num = n;

        while(n != 0) {
            int last_digit = n%10;
            if(last_digit != 0 && num%last_digit == 0) {
                ++count;
            }
            n=n/10;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(evenlyDivides(956));
    }
}
