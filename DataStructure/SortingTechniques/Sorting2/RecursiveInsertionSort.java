package DataStructure.SortingTechniques.Sorting2;

public class RecursiveInsertionSort {

    public static void insertionSort(int arr[], int n) {
        if(n <= 0) {
            return;
        }

        // yhn p recursion call kr die, so that niche wala part tb chote se bade k lie execute ho
        insertionSort(arr, n-1);

        int last = arr[n], i=n-1;

        // jb tk arr[i] bada hai, elements ko right shift krte jayenge
        // aur jaise hi ek chota element mil gya, whin insert kr dnege key ko

        while(i>=0 && arr[i] > last) {
            arr[i+1] = arr[i];
            --i;
        }
        arr[i+1] = last;

    }

    public static void main(String[] args) {
        int[] arr = {23,1,67,89, 32};
        insertionSort(arr, arr.length -1);
        for(int i=0; i<arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
