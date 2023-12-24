/*15] Sum of distinct elements

You are given an array Arr of size N. Find the sum of distinct elements in an array.
Example 1:
Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 15
Explanation: Distinct elements are 1, 2, 3
4, 5. So the sum is 15.
Example 2:
Input:
N = 5
Arr[] = {5, 5, 5, 5, 5}
Output: 5
Explanation: Only Distinct element is 5.
So the sum is 5.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N*logN)
Constraints:
1 ≤ N ≤ 10^7
0 ≤ A[i] ≤ 10^4
*/
import java.util.*;
class SumOfDistinct{

    public static int sum(int arr[],int n){
        Arrays.sort(arr);
        int arr1[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){

            while(i<n-1&&arr[i]==arr[i+1]){
                i++;
            }

            arr1[k++]=arr[i];
        }
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            
            sum=sum+arr1[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 2, 5};
        int n=5;

        System.out.println(sum(arr,n));
    }
}
