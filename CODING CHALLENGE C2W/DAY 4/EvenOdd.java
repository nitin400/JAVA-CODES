
/*
 * Code 3: Even and Odd

Company: Paytm, Amazon, Microsoft
Platform: GFG
Description:
Given an array arr[] of size N containing equal number of odd and even numbers.
Arrange the numbers in such a way that all the even numbers get the even index and
odd numbers get the odd index.
Note: There are multiple possible solutions, Print any one of them. Also, 0-based
indexing is considered.

Example 1:
Input:
N = 6
arr[] = {3, 6, 12, 1, 5, 8}
Output:
1
Explanation:
6 3 12 1 8 5 is a possible solution.
The output will always be 1 if your
rearrangement is correct.

Example 2:
Input:
N = 4
arr[] = {1, 2, 3, 4}
Output :
1
Your Task:
You don't need to read input or print anything. Your task is to complete the function
reArrange() which takes an integer N and an array arr of size N as input and reArranges
the array in Place without any extra space.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
 */

import java.util.Arrays;

public class EvenOdd {
        static void reArrange(int[] arr, int N) {
        // code here
        
            
        int n = arr.length;

        // Separate odd and even numbers
        int[] oddNumbers = Arrays.stream(arr).filter(x -> x % 2 != 0).toArray();
        int[] evenNumbers = Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();

        // Arrange numbers based on the given condition
        for (int i = 0; i < oddNumbers.length; i++) {
            arr[2 * i + 1] = oddNumbers[i];
        }

        for (int i = 0; i < evenNumbers.length; i++) {
            arr[2 * i] = evenNumbers[i];
       
    }
    }
}
