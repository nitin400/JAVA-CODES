/*
 * Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

 */

import java.util.PriorityQueue;

public class KthLargestElement{

        public int findKthLargest(int[] nums, int k) {
        // Create a min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add the first k elements to the min heap
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        // Iterate through the remaining elements in the array
        for (int i = k; i < nums.length; i++) {
            // If the current element is greater than the smallest element in the heap,
            // replace the smallest element in the heap with the current element
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        // The top element in the min heap is the kth largest element
        return minHeap.peek();
    }
    
 }