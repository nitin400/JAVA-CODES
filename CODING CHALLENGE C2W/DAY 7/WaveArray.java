/*
 * Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

If there are multiple solutions, find the lexicographically smallest one.

Note:The given array is sorted in ascending order, and you don't need to return anything to make changes in the original array itself.

 */
public class WaveArray {
    public static void convertToWave(int n, int[] a) {
        // Traverse the array and swap adjacent elements to create the wave-like pattern
        for (int i = 0; i < n - 1; i += 2) {
            // Swap adjacent elements
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
    }
}
