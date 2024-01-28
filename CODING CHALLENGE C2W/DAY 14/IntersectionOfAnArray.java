/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order
 * 
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfAnArray{

        public int[] intersection(int[] nums1, int[] nums2) {
        // Create HashSet to store unique elements from nums1
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        
        // Create a List to store the intersection elements
        List<Integer> intersectionList = new ArrayList<>();
        
        // Check for intersection in nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionList.add(num);
                // Remove the element from set to avoid duplicates in the result
                set.remove(num);
            }
        }
        
        // Convert the List to an array
        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            result[i] = intersectionList.get(i);
        }
        
        return result;
    }
 }