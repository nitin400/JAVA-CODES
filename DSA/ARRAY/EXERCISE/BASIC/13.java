/*13] Find unique element

Given an array of size n which contains all elements occurring in multiples of K,
except one element which doesn't occur in multiple of K. Find that unique element.
Example 1:
Input :
n = 7, k = 3
arr[] = {6, 2, 5, 2, 2, 6, 6}
Output :
5
Explanation:
Every element appears 3 times except 5.
Example 2:
Input :
n = 5, k = 4
arr[] = {2, 2, 2, 10, 2}
Output :
10
Explanation:
Every element appears 4 times except 10.
Expected Time Complexity: O(N. Log(A[i]) )
Expected Auxiliary Space: O( Log(A[i]) )
Constraints:
3<= N<=2*10^5
2<= K<=2*10^5
1<= A[i]<=10^9
*/

class Unique{
    public static int UniqueElement(int arr[],int n,int k){

        for(int i=0;i<n;i++){
            int count=0;
            int ele=arr[i];
            for(int j=i+1;j<n;j++){
                if(ele==arr[j])count++;

            }
            System.out.println(count);
            if(count+1==k){
                continue;
            }
            else{
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={6, 2, 5, 2, 2, 6, 6};
        int n=7;
        int k=3;
        System.out.println(UniqueElement(arr,n,k));

    }
}