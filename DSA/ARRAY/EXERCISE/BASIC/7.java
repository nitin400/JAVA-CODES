import java.util.*;
/*7] Form largest number from digits

Given an array of numbers from 0 to 9 of size N. Your task is to rearrange elements
of the array such that after combining all the elements of the array, the number
formed is maximum.
Example 1:
Input:
N = 5
A[] = {9, 0, 1, 3, 0}
Output:
93100
Explanation:
Largest number is 93100 which can be formed from array digits.
Example 2:
Input:
N = 3
A[] = {1, 2, 3}
Output:
321

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 <= N <= 10^7
0 <= Ai <= 9
*/

class FormLargestNumber{
    public static int largestNumber(int arr[]){
        int temp=0;
        int number=0;
         for (int i = 0; i < arr.length; i++) {   
            for (int j = i+1; j < arr.length; j++) {   
               if(arr[i] < arr[j]) {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }   
            }   
        } 
        for(int i=0;i<arr.length;i++){
            number=number*10+arr[i];
        }


        return number;
        
        

    }
    public static void main(String[] args) {
        
        int arr[]={9, 0, 1, 3, 0};

        System.out.println(largestNumber(arr));
    }
}