/*
 * Code 1: Check if Array Is Sorted and Rotated
Company: Amazon, Accenture, Goldman Sachs, Facebook, JP Morgan
Platform: Leetcode - 1752, GFG
Strivers DSE sheet
Description :
Given an array nums, return true if the array was originally sorted in
non-decreasing order, then rotated some number of positions (including zero).
Otherwise, return false. There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the same length such
that A[i] == B[(i+x) % A.length], where % is the modulo operation.
Example 1:
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3:
[3,4,5,1,2].
Example 2:
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
Example 3:
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array. You can rotate the array by x = 0
positions (i.e. no rotation) to make nums.

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100

 */

 public class ArrayIsRotatedInSorted{

    public boolean check(int[] nums) {
        int n = nums.length;

        // Find the pivot point
        int pivot = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                pivot = i;
                break;
            }
        }

        // Check if the array is sorted before and after the pivot point
        for (int i = 1; i < n; i++) {
            int index = (pivot + i) % n;
            if (nums[index] < nums[(index - 1 + n) % n]) {
                return false;
            }
        }

        return true;
    }
 }