/*
 * Code2 : Equal Left and Right Subarray Sum
Company : Amazon, Adobe
Platform : GFG
Description :
Given an array A of n positive numbers. The task is to find the first index in the
array such that the sum of elements before it equals the sum of elements after it.
Note: Array is 1-based indexed.
Example 1:
Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: For second test case at position 3 elements before it (1+3) =
elements after it (2+2).

Example 2:
Input:

n = 1
A[] = {1}
Output: 1
Explanation: Since it's the only element hence it is the only point.
Expected Time Complexity: O(N)
Expected Space Complexity: O(1)
Constraints:
1 <= n <= 106
1 <= A[i] <= 108
 * 
 */
public class EqualSum {

    int equalSum(int[] A, int N) {
        if (N == 0) {
            return -1; // Empty array, no valid index
        }

        // Calculate total sum of the array
        int totalSum = 0;
        for (int num : A) {
            totalSum += num;
        }

        // Initialize leftSum to 0 (sum of elements before the first index)
        int leftSum = 0;

        // Iterate through the array starting from the first index
        for (int i = 0; i < N; i++) {
            // Update totalSum by subtracting the current element
            totalSum -= A[i];

            // Check if the sum of elements before the current index is equal to the sum after
            if (leftSum == totalSum) {
                return i + 1; // Return 1-based index
            }

            // Update leftSum by adding the current element
            leftSum += A[i];
        }

        return -1; // No index found
    }
    
}
