import java.util.*;
/*8] Even occurring elements
Given an array Arr of N integers that contains an odd number of occurrences for all
numbers except for a few elements which are present even number of times. Find
the elements which have even occurrences in the array.
Example 1:
Input:
N = 11
Arr[] = {9, 12, 23, 10, 12, 12,
15, 23, 14, 12, 15}
Output: 12 15 23
Example 2:
Input:
N = 5
Arr[] = {23, 12, 56, 34, 32}
Output: -1
Explanation:
Every integer is present odd number of times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^5
0 ≤ Arr[i] ≤ 63
*/

class Occurences{
    public static HashSet<Integer> EvenOcc(int arr[]){
        List<Integer>result=new ArrayList<Integer>();
        int n=arr.length;
        for(int i=0;i<n;i++){
             int count = 0;
            int k=arr[i];
            int j=0;
            while(j<n){
                if(arr[j]==k){
                    count++;
                }
                j++;
            }
            if(count%2==0){
                result.add(arr[i]);
            }
        }
         HashSet<Integer> hset = new HashSet<Integer>(result);
        return hset;
    }
    public static void main(String[] args) {
        int arr[]={9, 12, 23, 10, 12, 12,15, 23, 14, 12, 15};

        System.out.println(EvenOcc(arr));
    }
}