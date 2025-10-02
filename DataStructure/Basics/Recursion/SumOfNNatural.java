package DataStructure.Basics.Recursion;

public class SumOfNNatural {

    public static int getSum(int x) {
        if(x == 0) {
            return 0;
        }

        return x + getSum(x-1);
    }

    public static void main(String[] args) {
        System.out.println(getSum(8));
    }
}
