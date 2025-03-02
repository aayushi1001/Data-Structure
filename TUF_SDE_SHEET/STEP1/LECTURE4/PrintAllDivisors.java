package TUF_SDE_SHEET.STEP1.LECTURE4;

public class PrintAllDivisors {

    public static void printDivisors(int x) {
        for(int i=1; i< Math.sqrt(x); ++i) {
            if(x%i == 0) {
                System.out.println(i);
                if(x/i != i) {
                    System.out.println(x/i);
                }
            }
        }
    }

    public static void main(String[] args) {
        printDivisors(48);
    }
}
