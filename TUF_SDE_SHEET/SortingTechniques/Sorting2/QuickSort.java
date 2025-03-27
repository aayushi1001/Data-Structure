package TUF_SDE_SHEET.SortingTechniques.Sorting2;

public class QuickSort {

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int getPartition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int j=low;

        for(int i= low; i<high; ++i) {
            if(nums[i] < pivot) {
                swap(nums, i, j);
                ++j;
            }
        }

        swap(nums, high, j);
        return j;
    }

    public static void quickSort(int[] nums, int low, int high) {
        if(low < high) {
            int partition = getPartition(nums, low, high);
            quickSort(nums, low, partition - 1);
            quickSort(nums, partition + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,1,2,34,89,43,-12};
        quickSort(arr, 0, 7);
        for(int i: arr) {
            System.out.println(i);
        }
    }
}
