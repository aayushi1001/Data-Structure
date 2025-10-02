package TUF_SDE_SHEET.Array.Easy;

public class IsSortedAndRotatedWithoutDuplicates {

    //This will fail for 6,10,6 or 10,1,1,10

    public static int getMinElementIndex(int[] arr) {
        int min_index = 0;
        for(int i=0; i<arr.length; ++i) {
            if(arr[min_index] > arr[i]) {
                min_index = i;
            }
        }

        return min_index;
    }

    public static boolean check(int[] arr) {
        int n = arr.length;
        int min_index = getMinElementIndex(arr);

        for(int i=min_index; i<n-1; ++i) {
            if(arr[i] > arr[i +1]) {
                return false;
            }
        }

        // 2,1,3,4 - min_index = 1
        // Everything after and before min_index is sorted, but it's not rotated because
        // first element has to be greater than last one here for this array to be rotated.
        if(min_index > 0 && arr[n-1] > arr[0]) {
            return false;
        }

        for(int i=0; i<min_index -1; ++i) {
            if(arr[i] > arr[i +1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(check(arr));
    }
}
