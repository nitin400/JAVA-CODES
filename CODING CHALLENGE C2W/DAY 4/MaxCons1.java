/*
 * Code 1: Max Consecutive Ones

Company: Google, Facebook, Amazon, Microsoft, Apple, Uber, Airbnb, Adobe, Goldman Sachs,
Bloomberg
Platform: Leetcode - 485, Coding Ninja
Striver’s SDE Sheet
Description:
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The
maximum number of consecutive 1s is 3.
Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2

Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.

 */

public class MaxCons1{

    public int findMaxConsecutiveOnes(int[] nums) {
        int islandSize = 0, maxIslandSize = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                islandSize++;
            } else {
                maxIslandSize = Math.max(maxIslandSize, islandSize);
                islandSize = 0;
            }
        }
        if(islandSize != 0) {
            maxIslandSize = Math.max(maxIslandSize, islandSize);
        }
        return maxIslandSize;
    }
}