/*
 * Code 1: Missing Number
Company: Flipkart, Morgan, Stanley, Accolite, Amazon, Microsoft, D-E-Shaw, Ola
Cabs, Payu, Visa, Intuit, Adobe, Cisco, Qualcomm
Platform: LeetCode - 268, GFG, Coding Ninjas
Striver’s SDE Sheet
Description:
Given an array nums containing n distinct numbers in the range [0, n], return the only
number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range
[0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range
[0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range
[0,9]. 8 is the missing number in the range since it does not appear in nums.

Constraints:
n == nums.length

1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
 */

 public class MissingNumber{

    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Initialize XOR value with n, as n is the maximum possible value in the range
        int missingNumber = n;
        
        // XOR all the indices and elements in the array
        for (int i = 0; i < n; i++) {
            missingNumber ^= i ^ nums[i];
        }
        
        return missingNumber;
    }
 }