package TUF_SDE_SHEET.Step1.LECTURE5;

public class Factorial {

    public static int getFactorial(int x) {
        if(x == 1) {
            return 1;
        }

        return x * getFactorial(x-1);
    }


    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
}
