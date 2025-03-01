package TUF_SDE_SHEET.STEP1.LECTURE4;

public class CountDigits {

    // First Approach - Modulo

    // Second Approach - Log
    // If the input is 0, answer comes out to be a big number in negative
    // Count comes out to be 1 less than actual

    public static void main(String[] args) {

        int n = 5434212;
        System.out.println((int) Math.log10(n) + 1);

    }
}
