package DataStructure.Array.Easy;

import java.util.ArrayList;

public class TwoSortedArrayUnion {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int i=0, j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        int index = 0;

        while(i < a.length && j < b.length) {

            // I've included equal condition here only as i will get incremented here
            // and in the next iteration it will fo to else if condition and will fail in inner condition
            // and j will also get incremented
            if(a[i] >= b[j]) {
                if(index == 0 || b[j] != ans.get(index-1)) {
                    ans.add(b[j]);
                    index++;
                }
                j++;
            } else if(a[i] < b[j]) {
                if(index == 0 || a[i] != ans.get(index-1)) {
                    ans.add(a[i]);
                    index++;
                }
                i++;
            }
        }

        while(i < a.length) {
            if(a[i] != ans.get(index-1)) {
                ans.add(a[i]);
                index++;
            }
            i++;
        }

        while(j < b.length) {
            if(b[j] != ans.get(index-1)) {
                ans.add(b[j]);
                index++;
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
