package TUF_SDE_SHEET.SortingTechniques.Sorting1;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        for(int i=0; i<arr.length ; ++i) {
            for (int j=i; j<arr.length - i -1; ++j) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23,1,67,89, 32};
        arr = bubbleSort(arr);
        for(int i=0; i<arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
