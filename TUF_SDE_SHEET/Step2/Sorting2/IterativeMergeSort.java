package TUF_SDE_SHEET.Step2.Sorting2;

public class IterativeMergeSort {

    public static void merge(int[] arr, int l, int m, int r) {
        MergeSort.merge(arr, l, m, r);
    }
    public static void sort(int[] arr) {
        int n = arr.length;

        // This size is the size of one subarray
        // Left + right = 2*size - next iteration point
        for(int size = 1; size < n; size = 2*size) {

            // l = l + 2*size and not l = 2*size
            //because it has to start from 0 and the condition value will always be 0 in that case
            for(int l=0; l< n-1; l = l + 2*size) {

                // We have to find the index. So, -1
                int r = Math.min(l + 2*size -1, n-1);
                int m = Math.min(l + size -1, n-1);

                merge(arr, l, m, r);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {23,1,67,89, 32};
        sort(arr);
        for(int i=0; i<arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
