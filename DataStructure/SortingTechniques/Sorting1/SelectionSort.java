package TUF_SDE_SHEET.SortingTechniques.Sorting1;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        for(int i=0; i<arr.length; ++i) {
            int min_index = i;

            for(int j=i+1; j<arr.length; ++j) {
                if(arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            if(i != min_index) {
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {23,7,90,101,4};
        arr = selectionSort(arr);
        for(int i=0; i< arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
