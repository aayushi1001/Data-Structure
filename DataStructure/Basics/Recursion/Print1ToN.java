package DataStructure.Basics.Recursion;

public class Print1ToN {

    public static void printN(int x, int i) {
        if(i > x) {
            return;
        }

        System.out.println(i);
        printN(x, i+1);
    }

    public static void main(String[] args) {
        printN(7,1);
    }
}
