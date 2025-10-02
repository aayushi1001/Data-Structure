package DataStructure.Basics.Recursion;

public class PrintFibonacci {

    public static int printFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return printFibonacci(n - 2) + printFibonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        for (int i=1; i<=n; ++i) {
            System.out.println(printFibonacci(i));
        }
    }
}
