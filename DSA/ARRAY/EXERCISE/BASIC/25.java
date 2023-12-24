
/*25] Maximum product of two numbers

Given an array Arr of size N with all elements greater than or equal to zero. Return
the maximum product of two numbers possible.
Example 1:
Input:
N = 6
Arr[] = {1, 4, 3, 6, 7, 0}
Output: 42
Example 2:
Input:
N = 5
Arr = {1, 100, 42, 4, 23}
Output: 4200
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
2 ≤ N ≤ 10^7
0 ≤ Arr[i] ≤ 10^4 */
import java.util.*;
class Maximum{
    
    public static int productOfTwoMaximumNumberInAnArray(int arr[]){
        Arrays.sort(arr); //nlog(n)
        int n=arr.length;
        return arr[n-1]*arr[n-2];

    }
    public static void main(String[] args) {
        int arr[]={1, 4, 3, 6, 7, 0};

        System.out.println(productOfTwoMaximumNumberInAnArray(arr));
    }
}