package DataStructure.BitManipulation.Hard;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static int countPrimes(int n) {
        if(n <= 2) {
            return 0;
        }

        int count = 1;
        // n/2 will give you odd numbers including 1 and the number itself
        // If you want prime including n -> (n-1)/2
        int size = (n -2)/2;
        boolean[] isPrime = new boolean[size];
        Arrays.fill(isPrime, true);

        for(int i=0; i<size; ++i) {
            if(isPrime[i]) {
                int num = 2*i+3;
                int startIndex = (num*num - 3)/2;
                if(startIndex >= size) {
                    break;
                }

                for(int j=startIndex; j<size; j=j+num) {
                    isPrime[j] = false;
                }
            }
        }

        for(int i=0; i<size; ++i) {
            if(isPrime[i]) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(countPrimes(47));
        System.out.println(countPrimes(48));
    }
}
