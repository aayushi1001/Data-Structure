package DataStructure.BitManipulation.Hard;

public class Pow {

    public double myPow(double x, int power) {
        long n = power;
        if(n ==0 || x == 1.0) {
            return 1;
        }

        if(n == 1) {
            return x;
        }

        double ans = 1.0;
        if(n < 0) {
            x = 1.0/x;
            n = -1 * n;
        }

        while(n > 0) {
            if(n%2 == 0) {
                x = x*x;
                n = n/2;
            }
            ans = ans*x;
            --n;
        }

        return ans;
    }

    public double myPow1(double x, int temp) {
        long n = temp;
        double ans=1.0;

        if(n<0) {
            n = n*(-1);
        }
        while(n >0) {
            if(n%2 == 0) {
                n = n/2;
                x = x*x;
            }
            else {
                n = n-1;
                ans = ans*x;
            }
        }
        if(temp < 0) {
            ans = 1.0/ans;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
