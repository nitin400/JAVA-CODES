public class Program9 {

    //write a program of second maximum element in the array..

    public static int SecondMax(int arr[]){

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
                temp=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max2 && temp!=arr[i]){
                max2=arr[i];
            }
        }

        return max2;



        

    }


    public static void main(String[] args) {
        
        int arr[]={2,255,2,1554,15,65};

        System.out.println(SecondMax(arr));
    }
    
}
