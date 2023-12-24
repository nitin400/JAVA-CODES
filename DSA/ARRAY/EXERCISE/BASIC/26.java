/*26] Positive and negative elements

Given an array arr[ ] containing equal number of positive and negative elements,
arrange the array such that every positive element is followed by a negative
element.
Note- The relative order of positive and negative numbers should be maintained.
Example 1:
Input:
N = 6
arr[] = {-1, 2, -3, 4, -5, 6}
Output:
2 -1 4 -3 6 -5
Explanation: Positive numbers in order are 2, 4 and 6. Negative numbers in
order are -1, -3 and -5. So the arrangement we get is 2, -1, 4, -3, 6 and -5.
Example 2:
Input:
N = 4
arr[] = {-3, 2, -4, 1}
Output:
2 -3 1 -4
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 ≤ N ≤ 10^6
1 ≤ arr[i] ≤ 10^9 */

import java.util.ArrayList;

class Arrangement {
    public static ArrayList<Integer> reArrange(int arr[]) {

        ArrayList<Integer> al = new ArrayList<>();
        int b = 0;
        int c = 0;
        int k = 0;
        int p = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                b++;
            if (arr[i] < 0)
                c++;
        }

        int positive[] = new int[b];
        int negative[] = new int[c];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                negative[k++] = arr[i];
            }
            if (arr[i] > 0) {
                positive[p++] = arr[i];

            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < positive.length)
                al.add(positive[i]);
            if (i < negative.length)
                al.add(negative[i]);
        }

        return al;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 9, 4, -5, 6, 7 };
        System.out.println(reArrange(arr));
    }
}