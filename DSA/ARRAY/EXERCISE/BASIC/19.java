/*19] Find common elements in three sorted arrays

Given three Sorted arrays in non-decreasing order, print all common elements in
these arrays.
Examples:
Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80
Input:
ar1[] = {1, 5, 5}
ar2[] = {3, 4, 5, 5, 10}
ar3[] = {5, 5, 10, 20}
Output: 5, 5 */
import java.util.*;
class Common {
    public static ArrayList<Integer> commonElements(int arr1[],int arr2[],int arr3[]){

        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++){
            int ele=arr1[i];
            boolean flag=false;
            for(int j=0;j<arr2.length;j++){
                if(ele==arr2[j]){

                for(int k=0;k<arr3.length;k++){

                    if(ele==arr3[k]){
                        flag=true;

                    }
                }

                }


            }
            if(flag==true){
                al.add(ele);
            }
        }
        return al;
    }

    public static void main(String[] args) {
       int arr1[] = {1, 5, 10, 20, 40, 80};
        int arr2[] = {6, 7, 20, 80, 100};
         int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};

         System.out.println(commonElements(arr1,arr2,arr3));
    }
}
