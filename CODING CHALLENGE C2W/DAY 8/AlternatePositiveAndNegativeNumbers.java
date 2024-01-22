/*
 * Company : Paytm, VMWare, Amazon, Microsoft, Intuit, Hotstar, PayU, FourKites, KPIT,
CodeNation
Love Bubbar’s SDE Sheet.
Platform : GFG, Coding Ninjas
Description :
Given an unsorted array Arr of N positive and negative numbers. Your task is to
create an array of alternate positive and negative numbers without changing the relative
order of positive and negative numbers.
Note: Array should start with a positive number and 0 (zero) should be considered a
positive element.
Example 1:
Input:
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation :
Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of
positive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed

elements.The output is 9,-2,4,-1,5,-5,0,-3,2.
Example 2:
Input:
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0
Explanation :
Positive elements : 5,2,4,7,1,8,0
Negative elements : -5,-2,-8
As we need to maintain the relative order of
positive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.
Your Task:
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 107
-106 ≤ Arr[i] ≤ 107
 */

import java.util.ArrayList;

public class AlternatePositiveAndNegativeNumbers {
    
        void rearrange(int arr[], int n) {
        // Separate positive and negative numbers
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        // Merge positive and negative numbers while maintaining relative order
        int i = 0, j = 0, k = 0;
        while (i < pos.size() && j < neg.size()) {
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }

        // Add remaining positive numbers (if any)
        while (i < pos.size()) {
            arr[k++] = pos.get(i++);
        }

        // Add remaining negative numbers (if any)
        while (j < neg.size()) {
            arr[k++] = neg.get(j++);
        }
    }
}
