package TUF_SDE_SHEET.Step3.Array.Easy;

public class SecondLargestElement {

    //Ask: Size of the array has to be greater than 2

    public static int getSecondLargest(int[] arr) {
        // Code Here

        int largest = arr[0];

        // cannot initialise second element with arr[0] because it won't pick an element which is smaller than this
        // and arr[0] could just be the largest element
        int second = -1;

        for(int i=1; i< arr.length; ++i) {
            if(largest < arr[i]) {
                second = largest;
                largest = arr[i];
            } else if(largest != arr[i] && second < arr[i]) {     // careful about the equal condition because repetition is allowed
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {23,1,67,89, 32};
        System.out.println(getSecondLargest(arr));
    }
}
