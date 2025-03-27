package TUF_SDE_SHEET.Array.Easy;

public class RemoveDuplicatesFromSortedArrayInPlace {

    // Brute Force - extra array/set and keep putting non-duplicates and then replace in the main array

    public static int removeDuplicates(int[] arr) {
        int j = 0;

        for(int i=1; i<arr.length; ++i) {
            if(arr[j] != arr[i]) {
                arr[++j] = arr[i];
            }
        }

        return j+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
