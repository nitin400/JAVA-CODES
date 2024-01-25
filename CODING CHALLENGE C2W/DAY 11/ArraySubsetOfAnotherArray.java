/*
 * Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. There can be duplicate elements.
 * 
 */

import java.util.HashMap;

public class ArraySubsetOfAnotherArray {
        public String isSubset(long a1[], long a2[], long n, long m) {
        // Create a frequency map for elements in a1
        HashMap<Long, Long> frequencyMap = new HashMap<>();
        for (long num : a1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0L) + 1);
        }

        // Check if all elements of a2 are present in a1 and their frequencies are sufficient
        for (long num : a2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}

