/*1] Search an Element in an array

Given an integer array and another integer element. The task is to find if the given
element is present in the array or not.
Example 1:
Input:
n = 4
arr[] = {1,2,3,4}
x = 3
Output: 2
Explanation: There is one test case with an array as {1, 2, 3 4} and an
element to be searched as 3. Since 3 is present at index 2, output is 2.
*/

class SearchArr{

    public static int SearchArr(int arr[], int ele,int n){

        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                return i;
        
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int arr[]={1,2,3,4};
        int x=3;
        int n=4;

        

        System.out.println(SearchArr(arr,x,n));

    }
}