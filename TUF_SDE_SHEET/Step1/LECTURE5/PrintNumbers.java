package TUF_SDE_SHEET.Step1.LECTURE5;

public class PrintNumbers {

    public static void printNumbers(int x) {
        if(x == 0) {
            return;
        }
        System.out.println(x);
        printNumbers(x-1);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
