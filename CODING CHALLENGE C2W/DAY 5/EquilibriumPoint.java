/*
 * Description :
Given an array A of n non negative numbers. The task is to find the first
equilibrium point in an array. Equilibrium point in an array is an index (or position) such
that the sum of all elements before that index is the same as the sum of elements after
it.
Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.
Example 1:
Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: The equilibrium point is at position 3 as the sum of elements
before it (1+3) = sum of elements after it (2+2).
Example 2:

Input:
n = 1
A[] = {1}
Output: 1
Explanation: Since there's only an element hence its only the equilibrium point.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
 */
public class EquilibriumPoint {

    public static int equilibriumPoint(long arr[], int n) {
        if (n == 1) {
            return 1; // Only one element, it's the equilibrium point
        }

        // Calculate total sum of the array
        long totalSum = 0;
        for (long num : arr) {
            totalSum += num;
        }

        // Initialize leftSum to 0 (sum of elements before the first index)
        long leftSum = 0;

        // Iterate through the array starting from the first index
        for (int i = 0; i < n; i++) {
            // Update totalSum by subtracting the current element
            totalSum -= arr[i];

            // Check if the sum of elements before the current index is equal to the sum after
            if (leftSum == totalSum) {
                return i + 1; // Return 1-based index
            }

            // Update leftSum by adding the current element
            leftSum += arr[i];
        }

        return -1; // No equilibrium point found
    }
    
}
