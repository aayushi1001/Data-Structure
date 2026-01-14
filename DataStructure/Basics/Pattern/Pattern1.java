package DataStructure.Basics.Pattern;
/** n = 3
  ******
  **  **
  *    *
  *    *
  **  **
  ******
 **/
public class Pattern1 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; ++i) {
            int star = 2 * (n - i);
            int space = 2 * n - star;

            for (int j = 0; j < n - i; ++j) {
                System.out.print("*");
            }

            for (int j = 0; j < space; ++j) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; ++j) {
                System.out.print("*");
            }

            System.out.print("\n");
        }


        for (int i = 0; i < n; ++i) {
            int space = 2*(n - i -1);

            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }

            for (int j = 0; j < space; ++j) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
