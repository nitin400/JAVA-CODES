class Solution {
    int binarysearch(int arr[], int n, int k) {
        return binarySearchRecursive(arr, 0, n - 1, k);
    }

    private int binarySearchRecursive(int arr[], int low, int high, int k) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return mid; // Element found, return its index
            } else if (arr[mid] < k) {
                return binarySearchRecursive(arr, mid + 1, high, k); // Search in the right half
            } else {
                return binarySearchRecursive(arr, low, mid - 1, k); // Search in the left half
            }
        }

        return -1; // Element not found
    }
}

