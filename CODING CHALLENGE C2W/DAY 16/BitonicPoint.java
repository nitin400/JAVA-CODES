
class Solution {
    int findMaximum(int[] arr, int n) {
        if (n == 1) {
            return arr[0]; // Only one element in the array
        }

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid]; // Maximum element found
                } else if (arr[mid - 1] > arr[mid]) {
                    high = mid - 1; // Search in the left half
                } else {
                    low = mid + 1; // Search in the right half
                }
            } else if (mid == 0) {
                return Math.max(arr[0], arr[1]); // First two elements are the maximum
            } else if (mid == n - 1) {
                return Math.max(arr[n - 1], arr[n - 2]); // Last two elements are the maximum
            }
        }

        return -1; // Should not reach here, just to satisfy the return type
    }
}