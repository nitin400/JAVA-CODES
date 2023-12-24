/*6] Elements in the Range

Given an array arr[] containing positive elements. A and B are two numbers
defining a range. The task is to check if the array contains all elements in the given
range.
Example 1:
Input: N = 7, A = 2, B = 5
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: Yes
Explanation: It has elements between range 2-5 i.e 2,3,4,5
Example 2:
Input: N = 7, A = 2, B = 6
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: No
Explanation: Array does not contain 6.
Note: If the array contains all elements in the given range then driver code outputs
Yes otherwise, it outputs No
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ N ≤ 10^7
*/

class Range{

    public static boolean isInRange(int arr[],int a,int b){

        int n=arr.length;
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            
            if(arr[i]==a){
                x=1;
            }
            else if(arr[i]==b ){
                y=1;
            }
        }

        if(x==1 && y==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int arr[]={1, 4, 5, 2, 7, 8, 3};
        int a=2;
        int b=6;

        System.out.println(isInRange(arr,a,b));
    }
}