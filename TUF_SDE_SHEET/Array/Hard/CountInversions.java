package TUF_SDE_SHEET.Array.Hard;

import java.util.ArrayList;

public class CountInversions {

    public static int merge1(int[] num, int l, int m, int r) {
        // finding the length of two arrays
        int n1 = m -l +1;
        int n2 = r - m;

        // creating two arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0; i<n1; ++i) {
            left[i] = num[l+i];
        }

        for(int i=0; i<n2; ++i) {
            right[i] = num[m+i+1];
        }

        // process of merging
        int i = 0, j = 0, k = l;
        int count = 0;
        while(i<n1 && j<n2) {
            if(left[i] <= right[j]) {
                num[k] = left[i];
                i++;
            } else {
                num[k] = right[j];
                j++;
                count = count + (n1 - i);
            }
            k++;
        }

        while(i<n1) {
            num[k] = left[i];
            i++;
            k++;
        }

        while(j < n2) {
            num[k] = right[j];
            j++;
            k++;
        }

        return count;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        int cnt = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1); //Modification 2
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt;
    }

    public static int mergeSort(int[] num, int l, int h) {
        int count = 0;
        if(l >= h) {
            return count;
        }
        int mid = l + (h - l)/2;
        count += mergeSort(num, l, mid);
        count += mergeSort(num, mid + 1, h);
        count += merge1(num, l , mid, h);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(mergeSort(new int[]{5,3,2,1,4}, 0, 4));
    }
}
