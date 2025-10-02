package TUF_SDE_SHEET.Array.Hard;

public class PascalTriangle {

    // Given the row and column, find the element present in Pascal's triangle
    public static int getPascalTriangleElement(int r, int c) {
        r = r-1;
        c= c-1;
        int ans = 1;

        int i=0;

        while(i < r-c) {
            ans = ans * (r-i);
            ans = ans / (i +1);
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getPascalTriangleElement(8,6));
    }
}
