/*
 * Code 1: Two Sum

Company: Google, Meta, Amazon, Microsoft, Paypal+76 more companies
Platform : Leetcode - 1
Fraz’s & striver’s SDE sheet.
Description
Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use
the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

 */

import java.util.HashMap;

public class TwoSum{

    public static void main(String[] args) {
    public int[] twoSum(int[] nums, int target ){
    int ans[]=new int[2];
    int n=nums.length;
    HashMap<Integer,Integer> hm=new HashMap<>();

    for(int i=0;i<n;i++){

        int temp=target-nums[i];

        // isPresent Hashmap madhe aahe ka 
        if(hm.containsKey(temp)){

            // tyachi value ani i chi value arr madhe takaychi
            ans[0]=hm.get(temp);
            ans[1]=i;
            return ans;
        }
        else{

            hm.put(nums[i],i);
        }
        

    } 
    return ans;
        


        
        
    }
    }
 }