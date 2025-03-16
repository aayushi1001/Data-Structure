package TUF_SDE_SHEET.Step1.LECTURE4;

public class GCD {
    public static int getGCD(int a, int b) {
        while(a > 0 && b>0) {
            if(a>b) {
                a = a%b;
            } else {
                b = b%a;
            }
        }

        if(a != 0) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(getGCD(100, 12));
    }
}
