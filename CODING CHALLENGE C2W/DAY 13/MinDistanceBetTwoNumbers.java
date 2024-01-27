/*
 * You are given an array a, of n elements. Find the minimum index based distance between two distinct elements of the array, x and y. Return -1, if either x or y does not exist in the array.
 * 
 */
public class MinDistanceBetTwoNumbers {
    
}    int minDist(int a[], int n, int x, int y) {
    int lastX = -1; // Last index of element x
    int lastY = -1; // Last index of element y
    int minDistance = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
        if (a[i] == x) {
            if (lastY != -1) {
                minDistance = Math.min(minDistance, i - lastY);
            }
            lastX = i;
        } else if (a[i] == y) {
            if (lastX != -1) {
                minDistance = Math.min(minDistance, i - lastX);
            }
            lastY = i;
        }
    }

    // Check if both x and y were found in the array
    if (lastX == -1 || lastY == -1) {
        return -1;
    }

    return minDistance;
}
