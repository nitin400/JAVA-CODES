/*10] Max Odd Sum

Given an array of integers, check whether there is a subsequence with odd sum and
if yes, then find the maximum odd sum. If no subsequence contains an odd sum,
print -1.
Example 1:
Input:
N=4
arr[] = {4, -3, 3, -5}
Output: 7
Explanation:
The subsequence with maximum odd
sum is 4 + 3 = 7
Example 2:
Input:
N=5
arr[] = {2, 5, -4, 3, -1}
Output: 9
Explanation:
The subsequence with maximum odd
sum is 2 + 5 + 3 + -1 = 9
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
2 ≤ N ≤ 10^7
-10^3 <= arr[i] <= 10^3
*/

class subsequence{
    static int findMaxOddSubarraySum(int arr[], int n)
{
    int min_odd = Integer.MAX_VALUE;
 
    boolean isOdd = false;
     
    int sum = 0;
    for (int i = 0 ; i < n ; i++)
    {
        if (arr[i] > 0)
            sum = sum + arr[i];
 
        if (arr[i] % 2 != 0)
        {
            isOdd = true;
            if (min_odd > Math.abs(arr[i]))
                min_odd = Math.abs(arr[i]);
        }
    }
 
    if (isOdd == false)
    return -1;

    if (sum % 2 == 0)
        sum = sum - min_odd;
 
    return sum;
}
    public static void main(String[] args) {
        int arr[]={2, 5, -4, 3, -1};
    }
}