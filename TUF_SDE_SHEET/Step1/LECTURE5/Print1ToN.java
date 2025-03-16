package TUF_SDE_SHEET.Step1.LECTURE5;

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
