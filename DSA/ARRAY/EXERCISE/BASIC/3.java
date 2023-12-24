/*3] Largest Element in Array

Given an array A[] of size n. The task is to find the largest element in it.
Example 1:
Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output: 90
Explanation:
The largest element of a given array is 90.
Example 2:
Input:
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}
Output: 5
Explanation:
The largest element of a given array is 5.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= n<= 10^3
0 <= A[i] <= 10^3
Arrays may contain duplicate elements.
*/

class Largest {

    public static int LargestElementInArray(int arr[], int n) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;

    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 0, 3, 2, 4, 5 };
        int n = 7;
        System.out.println(LargestElementInArray(a, n));

    }
}