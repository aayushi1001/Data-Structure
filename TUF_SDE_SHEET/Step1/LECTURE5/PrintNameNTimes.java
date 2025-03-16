package TUF_SDE_SHEET.Step1.LECTURE5;

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
