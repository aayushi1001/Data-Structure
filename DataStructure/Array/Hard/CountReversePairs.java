package DataStructure.Array.Hard;

public class CountReversePairs {

    public static void merge1(int[] num, int l, int m, int r) {
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
        while(i<n1 && j<n2) {
            if(left[i] <= right[j]) {
                num[k] = left[i];
                i++;
            } else {
                num[k] = right[j];
                j++;
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
    }

    public static int countPairs(int[] num, int l, int m, int h) {
        int count = 0;
        int i = l, j = m+1;
        while(i <= m && j <= h) {
            if(num[i] > 2*num[j]) {
                count += (m - i + 1);
                j++;
            } else {
                i++;
            }
        }

        return count;
    }

    public static int mergeSort(int[] num, int l, int h) {
        int count = 0;
        if(l >= h) {
            return count;
        }
        int mid = l + (h - l)/2;
        count += mergeSort(num, l, mid);
        count += mergeSort(num, mid + 1, h);
        count += countPairs(num, l, mid, h);
        merge1(num, l , mid, h);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(mergeSort(new int[]{1,3,2,3,1}, 0, 4));
    }
}
