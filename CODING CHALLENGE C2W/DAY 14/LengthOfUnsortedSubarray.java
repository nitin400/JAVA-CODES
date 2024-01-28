/*
 * Given an unsorted array Arr of size N. Find the subarray Arr[s...e] such that sorting this subarray makes the whole array sorted.
 * 
 */
public class LengthOfUnsortedSubarray {
    int[] printUnsorted(int[] arr, int n) {
        int[] result = new int[2];
        
        // Find the starting point of the unsorted subarray
        int s = 0;
        while (s < n - 1 && arr[s] <= arr[s + 1]) {
            s++;
        }

        // If the array is already sorted
        if (s == n - 1) {
            result[0] = 0;
            result[1] = 0;
            return result;
        }

        // Find the ending point of the unsorted subarray
        int e = n - 1;
        while (e > 0 && arr[e] >= arr[e - 1]) {
            e--;
        }

        // Find the minimum and maximum elements in the subarray Arr[s...e]
        int minInSubarray = Integer.MAX_VALUE;
        int maxInSubarray = Integer.MIN_VALUE;
        for (int i = s; i <= e; i++) {
            minInSubarray = Math.min(minInSubarray, arr[i]);
            maxInSubarray = Math.max(maxInSubarray, arr[i]);
        }

        // Find the index where Arr[s] is greater than the minimum element
        while (s > 0 && arr[s - 1] > minInSubarray) {
            s--;
        }

        // Find the index where Arr[e] is smaller than the maximum element
        while (e < n - 1 && arr[e + 1] < maxInSubarray) {
            e++;
        }

        result[0] = s;
        result[1] = e;
        return result;
    }
}
