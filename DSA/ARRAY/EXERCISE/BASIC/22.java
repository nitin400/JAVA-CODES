/*22] Exceptionally odd

Given an array of N positive integers where all numbers occur even number of
times except one number which occurs odd number of times. Find the exceptional
number.
Example 1:
Input:
N = 7
Arr[] = {1, 2, 3, 2, 3, 1, 3}
Output: 3
Explanation: 3 occurs three times.
Example 2:
Input:
N = 7
Arr[] = {5, 7, 2, 7, 5, 2, 5}
Output: 5
Explanation: 5 occurs three times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^5
1 ≤ arr[i] ≤ 10^6
*/

class ExceptionallyOdd{
    public static int Odd(int arr[]){

        for(int i=0;i<arr.length;i++){
            
            int ele=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){

                if(ele==arr[j]){
                    count++;
                }

            }
                if(count%2!=0){
                    return ele;
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[]={1, 2, 3, 2, 3, 1, 3};

        System.out.println(Odd(arr));
    }
}