/*
 * Code3 : Count pairs with given sum
Company: Amazon, MakeMyTri, Facebook, UnitedHealth Group
Platform: GFG
Love Babbar’s SDE Sheet
Description:
Given an array of N integers, and an integer K, find the number of pairs of
elements in the array whose sum is equal to K.
Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation:
arr[0] + arr[1] = 1 + 5 = 6 and arr[1] + arr[3] = 5 + 1 = 6.
Example 2:
Input:
N = 4, K = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation:
Each 1 will produce sum 2 with any 1.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 <= N <= 105
1 <= K <= 108
1 <= Arr[i] <= 106
 */

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {

    class Solution {
    int getPairsCount(int[] arr, int n, int k) {
                int count = 0;
        // HashMap to store the occurrences of elements
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the complement (K - arr[i]) is present in the map
            int complement = k - arr[i];
            if (map.containsKey(complement)) {
                // Increment the count for each pair found
                count += map.get(complement);
            }

            // Update the occurrences of the current element in the map
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}

    
}
