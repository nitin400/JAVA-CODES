/*
 * Code 2: Next Greater Element I

Company: Flipkart, Amazon, Microsoft, MakeMyTrip, Adobe
Platform: Leetcode - 496, GFG
Description:

The next greater element of some element x in an array is the first greater element that
is to the right of x in the same array.
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a
subset of nums2.
For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and
determine the next greater element of nums2[j] in nums2. If there is no next greater
element, then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element
as described above.
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NextGreaterEle1 {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
           List<Integer> ans = new ArrayList<>();
    Map<Integer, Integer> numToNextGreater = new HashMap<>();
    Deque<Integer> stack = new ArrayDeque<>(); // a decreasing stack

    for (final int num : nums2) {
      while (!stack.isEmpty() && stack.peek() < num)
        numToNextGreater.put(stack.pop(), num);
      stack.push(num);
    }

    for (final int num : nums1)
      if (numToNextGreater.containsKey(num))
        ans.add(numToNextGreater.get(num));
      else
        ans.add(-1);

    return ans.stream().mapToInt(Integer::intValue).toArray();
  } 
}
