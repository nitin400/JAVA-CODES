public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        // Perform QuickSelect to find the kth smallest element
        return quickSelect(arr, l, r, k);
    }

    private static int quickSelect(int[] arr, int l, int r, int k) {
        if (l == r) {
            return arr[l]; // Found the kth smallest element
        }

        int pivotIndex = partition(arr, l, r);

        // Check if the pivot is at the desired position (k-1)
        if (pivotIndex == k - 1) {
            return arr[pivotIndex];
        } else if (pivotIndex < k - 1) {
            // Search in the right subarray
            return quickSelect(arr, pivotIndex + 1, r, k);
        } else {
            // Search in the left subarray
            return quickSelect(arr, l, pivotIndex - 1, k);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        // Choose a pivot element (here, we'll use the last element)
        int pivot = arr[r];

        int i = l; // Index of smaller element
        for (int j = l; j < r; j++) {
            if (arr[j] <= pivot) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        // Place the pivot in its correct position
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        return i;
    }
}
