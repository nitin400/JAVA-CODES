/*
 * Code2: Three Great Candidates/ Three Ninja Candidates/
Maximum Product of Three Numbers
Company: Flipkart, Amazon, Snapdeal
Platform: Leetcode- 628, GFG, Coding Ninja
Fraz’s SDE Sheet
Description :
The hiring team aims to find 3 candidates who are great collectively. Each
candidate has his or her ability expressed as an integer. 3 candidates are great
collectively if the product of their abilities is maximum. Given abilities of N candidates in
an array arr[], find the maximum collective ability from the given pool of candidates.
Example 1:
Input:
N = 5
Arr[] = {10, 3, 5, 6, 20}
Output: 1200
Explanation:The multiplication of 10, 6 and 20 is 1200.

Example 2:
Input:
N = 5
Arr[] = {-10, -3, -5, -6, -20}
Output: -90
Explanation:
Multiplication of -3, -5 and -6 is -90.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
3 ≤ N ≤ 107
-105 ≤ Arr[i] ≤ 105
 */

import java.util.Arrays;

public class MaxProductOfThreeNumbers {
    
        public int maximumProduct(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int n = nums.length;

        // Calculate the product of the three largest numbers
        int maxProduct = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Calculate the product of the two smallest numbers and the largest number
        int alternativeProduct = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum of the two products
        return Math.max(maxProduct, alternativeProduct);
    }
}
