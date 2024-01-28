/*
 * Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.
 * 
 */
public class SmallesSubarrayWithSumGreaterThanX {
    public static int smallestSubWithSum(int a[], int n, int x) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            // Expand the window
            sum += a[end];

            // Contract the window from the left until the sum becomes less than x
            while (sum > x) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= a[start];
                start++;
            }
        }

        // If no subarray found, return 0
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }

        return minLen;
    }
}
