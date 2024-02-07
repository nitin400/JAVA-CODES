import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static ArrayList<Double> findMedian(ArrayList<Integer> arr, int n, int m) {
        ArrayList<Double> result = new ArrayList<>();

        for (int i = 0; i <= n - m; i++) {
            ArrayList<Integer> subarray = new ArrayList<>(arr.subList(i, i + m));
            Collections.sort(subarray);

            double median;
            if (m % 2 == 0) {
                // If the size is even, take the mean of two middle elements
                int mid1 = subarray.get(m / 2 - 1);
                int mid2 = subarray.get(m / 2);
                median = (double) (mid1 + mid2) / 2;
            } else {
                // If the size is odd, take the middle element
                median = subarray.get(m / 2);
            }

            result.add(median);
        }

        return result;
    }
  
}