package DataStructure.SortingTechniques.Sorting2;

public class MergeSort {

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0; i<n1; ++i) {
            left[i] = arr[l+i];
        }

        for(int i=0; i<n2; ++i) {
            // m is included in left array, so start with m+1
            right[i] = arr[m+i+1];
        }

        int k = l, i=0, j=0;

        while(i<n1 && j<n2) {
            if(left[i] < right[j]) {
                arr[k] = left[i];
                ++i;
            } else {
                arr[k] = right[j];
                ++j;
            }
            ++k;
        }

        while(i<n1) {
            arr[k] = left[i];
            ++k;
            ++i;
        }

        while(j<n2) {
            arr[k] = right[j];
            ++j;
            ++k;
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if(l<r) {
            int m = l + (r-l)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public static int[] mergeSort(int[] arr) {
        sort(arr, 0, arr.length -1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {23,1,67,89, 32};
        arr = mergeSort(arr);
        for(int i=0; i<arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
