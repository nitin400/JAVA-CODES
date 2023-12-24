
/*27] Count pair sum

Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements.
Given a value Sum. The problem is to count all pairs from both arrays whose sum
is equal to Sum.
Note: The pair has an element from each array.
Example 1:
Input:
M=4, N=4 , Sum = 10
arr1[] = {1, 3, 5, 7}
arr2[] = {2, 3, 5, 8}
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).
Example 2:
Input:
N=4, M=4, sum=5
arr1[] = {1, 2, 3, 4}
arr2[] = {5, 6, 7, 8}
Output: 0
Expected Time Complexity: O(M+N).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ M, N ≤ 10^5 */
// sorted , distinct and size pn mahitey pair chi value return karaychi aahe
class PairSum{
    public static int pairsCount(int arr1[],int arr2[],int m,int n,int sum){
        int result=0;
        for(int i=0;i<m;i++){
            int ele=arr1[i];

            for(int j=0;j<n;j++){
                if(ele+arr2[j]==sum){
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int m=4;
        int n=4;
        int sum=10;
        int arr1[]={1, 3, 5, 7};
        int arr2[]={2, 3, 5, 8};

        System.out.println(pairsCount(arr1,arr2,m,n,sum));
    }
}
