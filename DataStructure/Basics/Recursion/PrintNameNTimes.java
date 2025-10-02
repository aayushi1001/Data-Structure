package DataStructure.Basics.Recursion;

public class PrintNameNTimes {

    public static void printName(int x) {
        if(x == 0) {
            return;
        }

        System.out.println("Aayushi");
        printName(x-1);
    }

    public static void main(String[] args) {
        printName(7);
    }
}
