
/*
 * Given an unsorted array of size N. Find the first element in array such that all of its left elements are smaller and all right elements to it are greater than it.

Note: Left and right side elements can be equal to required element. And extreme elements cannot be required element.
 */
public class ElementWithLeftSideSmallerAndRightSideGreater {
    
    public int findElement(int arr[], int n) {
        if (n < 3) {
            return -1;
        }

        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        }

        rightMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= leftMax[i] && arr[i] <= rightMin[i]) {
                return arr[i];
            }
        }

        return -1;
    }
}
