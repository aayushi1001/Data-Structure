package DataStructure.Basics.Pattern;

/**
 * 4444444
 * 4333334
 * 4322234
 * 4321234
 * **/
public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;

        for(int i=0; i<n; ++i) {
            int middle = n-i;
            int middleCount = 2*(n - i - 1);
            for(int j=n; j>middle; --j) {
                System.out.print(j);
            }

            for (int j=0; j<middleCount; j++) {
                System.out.print(middle);
            }

            for(int j=middle; j<=n; ++j) {
                System.out.print(j);
            }

            System.out.print("\n");

        }
    }
}
