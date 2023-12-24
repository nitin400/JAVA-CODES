/*23] Find the smallest and second smallest element in an array

Given an array of integers, your task is to find the smallest and second smallest
element in the array. If smallest and second smallest do not exist, print -1.
Example 1:
Input :
5
2 4 3 5 6
Output :
2 3
Explanation:
2 and 3 are respectively the smallest
and second smallest elements in the array.
Example 2:
Input :
6
1 2 1 3 6 7
Output :
1 2
Explanation:
1 and 2 are respectively the smallest
and second smallest elements in the array.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1<=N<=10^5
1<=A[i]<=10^5 */

import java.util.ArrayList;

class SmallestAndSecondSmallestElement {
    public static ArrayList<Integer> SmallestAndSecondSmallestElement(int arr[]) {
        ArrayList<Integer> al=new ArrayList<>();
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            if (arr[i] < secondMin && arr[i]!=min ) {
                secondMin = arr[i];
                
            }
        }
        al.add(min);
        al.add(secondMin);
        return al;



    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 1, 3, 6, 7 };

        System.out.println(SmallestAndSecondSmallestElement(arr));
        //SmallestAndSecondSmallestElement(arr);
    }
}