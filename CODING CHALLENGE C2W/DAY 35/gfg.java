class Solution {
    private static long inversionCount = 0; // Keep track of inversions

    // Merge function (Helper for mergeSort)
    private static long merge(long[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        long[] leftArr = new long[n1];
        long[] rightArr = new long[n2];

        // Copy data
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Count inversions during the merge process
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
                inversionCount += (n1 - i); // Key part: Count inversions
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

        return inversionCount; 
    }

    // Merge sort function
    private static void mergeSort(long[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // Main inversion counting function
    static long inversionCount(long arr[], long N) {
        inversionCount = 0; // Reset inversion count
        mergeSort(arr, 0, (int) N - 1);
        return inversionCount;
    }

    // Example usage
    public static void main(String[] args) {
        long[] arr = {2, 4, 1, 3, 5};
        long N = arr.length;
        long result = inversionCount(arr, N);
        System.out.println("Inversion Count: " + result);
    }
}
