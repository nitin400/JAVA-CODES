/*18] Find Subarray with given sum | Set 1 (Non-negative
Numbers)
Given an array arr[] of non-negative integers and an integer sum, find a subarray
that adds to a given sum.
Note: There may be more than one subarray with sum as the given sum, print first
such subarray.
Examples:
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Output: Sum found between indexes 1 and 4
Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7
Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
Explanation: There is no subarray with 0 sum */
import java.util.*;
class SubArray{
    public static List<Integer> sumOfSubarray(int arr[],int target){

        List<Integer>ll=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            int sum=0;

            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(target==sum){
                    ll.add(i);
                    ll.add(j);
                    
                }

            }
        }
        return ll;
        
    }

    public static void main(String[] args) {
        
        int arr[]={1, 4, 20, 3, 10, 5};
        int target=33;

        System.out.println(sumOfSubarray(arr,target));
    }
}