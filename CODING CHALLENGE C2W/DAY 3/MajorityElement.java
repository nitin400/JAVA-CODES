/*
 * Code 1: Majority Element
Company: Flipkart, Accolite, Amazon, Microsoft, D-E-Shaw, Google, Nagarro, Atlassian
Platform : Leetcode - 169, GFG
Fraz’s & striver’s SDE sheet.
Description

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than [n / 2⌋ times. You
may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */

public class MajorityElement{

    
        public int majorityElement(int[] nums) {
            int n=nums.length;
         HashMap<Integer, Integer> hashMap = new HashMap<>();
         
         for(int ele:nums){
    
             if(hashMap.containsKey(ele)){
    
                 hashMap.put(ele, hashMap.get(ele)+1);
             }else{
    
                 hashMap.put(ele, 1);
             }
   

import java.util.HashMap;
import java.util.Map;

         int targetValue = n/2;
    
    for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue()>targetValue) 
    return entry.getKey();
                }
            
        return -1;
        }
        