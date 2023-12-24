/*21] First element to occur k times

Given an array of N integers. Find the first element that occurs at least K number
of times.
Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
4
Explanation:
Both 7 and 4 occur 2 times.
But 4 is first that occurs 2 times
As at index = 4, 4 has occurred
at least 2 times whereas at index = 6,
7 has occurred at least 2 times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 <= N <= 10^4
1 <= K <= 100
1<= A[i] <= 200*/

import java.util.HashMap;

class Element{
    public static int firstOccurance(int arr[],int n,int k){

        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int count=0;
            int ele=arr[i];
            for(int j=0;j<n;j++){
                if(ele==arr[j]){
                    count++;
                }
                if(count>=2){
                    hm.put(ele,i);
                    
                }
                
            }
        }

        int lowestValue = Integer.MAX_VALUE;
        int resultKey = -1;

        for (Integer key : hm.keySet()) {
            int value = hm.get(key);
            if (value < lowestValue) {
                lowestValue = value;
                resultKey = key;
            }
        }

        return resultKey;

        

    }

    public static void main(String[] args) {
       int arr[] = {1, 7, 4, 3, 4, 8, 7};
       int k=2;
       int n=7;
       
       System.out.println(firstOccurance(arr,n,k));
    }
}