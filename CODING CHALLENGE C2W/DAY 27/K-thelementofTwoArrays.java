class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        // Ensure arr1 is the smaller array
        if (n > m) {
            return kthElement(arr2, arr1, m, n, k);
        }

        int low = Math.max(0, k - m); // Minimum elements from arr1 needed
        int high = Math.min(n, k);     // Maximum elements from arr1 needed

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = k - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : arr1[partitionX - 1];
            int minY = (partitionY == 0) ? Integer.MIN_VALUE : arr2[partitionY - 1];

            int minX = (partitionX == n) ? Integer.MAX_VALUE : arr1[partitionX];
            int maxY = (partitionY == m) ? Integer.MAX_VALUE : arr2[partitionY];

            if (maxX <= maxY && minY <= minX) {
                return Math.max(maxX, minY);
            } else if (maxX > maxY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        // This should not happen if the input constraints are followed
        throw new IllegalArgumentException("Invalid input");
    }
}