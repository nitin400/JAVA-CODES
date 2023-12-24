/*12] First and last occurrences of X
Given a sorted array having N elements, find the indices of the first and last
occurrences of an element X in the given array.
Note: If the number X is not found in the array, return '-1' as an array.
Example 1:
Input:
N = 4 , X = 3
arr[] = { 1, 3, 3, 4 }
Output:
1 2
Explanation:
For the above array, first occurance of X = 3 is at index = 1 and last
occurrence is at index = 2.

Example 2:
Input:
N = 4, X = 5
arr[] = { 1, 2, 3, 4 }
Output:
-1
Explanation:
As 5 is not present in the array, so the answer is -1.
Expected Time Complexity: O(log(N))
Expected Auxiliary Space: O(1)
*/
import java.util.*;
class Occurrence{
    public static List<Integer> firstAndLastOccuranceOfAnElement(int arr[],int n,int x){
        List<Integer>ll=new ArrayList<Integer>();
        int first=0;
        int last=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                first=i;
                break;
            }
        }
        
        for(int i=first;i<n;i++){
            if(arr[i]!=x){
                last=i-1;

            }
        }
        ll.add(first);
        ll.add(last);
        return ll;

    }
    public static void main(String[] args) {
        int arr[]={ 1, 3, 3, 4 };
        int n=4;
        int x=3;
        System.out.println(firstAndLastOccuranceOfAnElement(arr,n,x));
        
    }

}
