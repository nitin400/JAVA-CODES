/*
 * Code3 : Find the smallest and second smallest element in
an array
Company: Amazon, Goldman Sachs
Platform: GFG
Description:
Given an array of integers, your task is to find the smallest and second smallest
element in the array. If smallest and second smallest do not exist, print -1.
Example 1:
Input :
5
2 4 3 5 6
Output :
2 3
Explanation:
2 and 3 are respectively the smallest
and second smallest elements in the array.

Example 2:
Input :
6
1 2 1 3 6 7
Output :
1 2
Explanation:
1 and 2 are respectively the smallest
and second smallest elements in the array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1<=N<=105
1<=A[i]<=105
 */
public class SmallestAndSecondSmallestEleInAnArrayGFG {

    public long[] minAnd2ndMin(long a[], long n)  
    {
        
        long[] temp=new long[2];
        
        long small=Long.MAX_VALUE;
        long secondSmall=Long.MAX_VALUE;
        int flag=0;
        for(int i=0;i<n;i++){
            long ele=a[0];
            
            if(ele!=a[i]){
                flag=1;
            }
        }
        
        if(flag==0){
            temp[0]=-1;
            return temp;
        } 
        
        for(int i=0;i<n;i++){
            
            if(a[i]<small){
                
                secondSmall=small;
                small=a[i];
                
            }
            
            if (a[i] < secondSmall && a[i] != small) 
                secondSmall = a[i]; 
            
            
        }
        
        temp[0]=small;
        temp[1]=secondSmall;
        
        return temp;
        
    }
    
}
