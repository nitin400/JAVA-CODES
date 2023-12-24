// 2] Find minimum and maximum element in an array

// Given an array A of size N of integers. Your task is to find the minimum and
// maximum elements in the array.
// Example 1:
// Input:
// N = 6
// A[] = {3, 2, 1, 56, 10000, 167}
// Output: 1 10000
// Explanation: minimum and maximum elements of array are 1 and 10000.
// Example 2:
// Input:
// N = 5
// A[] = {1, 345, 234, 21, 56789}
// Output: 1 56789
// Explanation: minimum and maximum elements of array are 1 and 56789.
// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)
// Constraints:
// 1 <= N <= 10^5
// 1 <= Ai <=10^12

class MinMax{

    public static int MinElement(int arr[],int n){
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int MaxElement(int arr[], int n){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args){

        int arr[]={1, 345, 234, 21, 56789};
        int n=5;
        System.out.println(MinElement(arr,n));
        System.out.println(MaxElement(arr,n));
    }
}