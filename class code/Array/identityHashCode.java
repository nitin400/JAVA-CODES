public class identityHashCode {

    public static void main(String []args){
        int arr1[]={10,20,30,40};
        int arr2[]={10,20,30,40};

        System.out.println(System.identityHashCode(arr1[0]));
        System.out.println(System.identityHashCode(arr2[0]));
    }
    
}
