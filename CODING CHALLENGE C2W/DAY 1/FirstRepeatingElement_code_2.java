/*
 * Company: Amazon, oracle
Platform: GFG
Striver’s SDE Sheet
Description:
Given an array arr[] of size n, find the first repeating element. The element
should occur more than once and the index of its first occurrence should be the
smallest.
Note:- The position you return should be according to 1-based indexing.
Example 1:
Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation:
5 is appearing twice and
its first appearance is at index 2
which is less than 3 whose first
occurring index is 3.

Example 2:
Input:
n = 4
arr[] = {1, 2, 3, 4}
Output: -1
Explanation:
All elements appear only once so
the answer is -1.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
Constraints:
1 <= n <= 106
0 <= Ai<= 106
 */

import java.util.HashMap;

public class FirstRepeatingElement_code_2 {

        public static int firstRepeated(int[] arr, int n) {
        
  HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        HashMap<Integer, Integer> indexMap = new HashMap<>();

        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];

            if (indexMap.containsKey(currentElement)) {
                int firstOccurrenceIndex = indexMap.get(currentElement);
                // Update the result only if it's the first repeating element found so far
                if (result == -1 || firstOccurrenceIndex < result) {
                    result = firstOccurrenceIndex;
                }
            } else {
                // Store the index of the first occurrence of the element
                indexMap.put(currentElement, i + 1); // 1-based indexing
            }
        }

        return result;
        
}
    
}
