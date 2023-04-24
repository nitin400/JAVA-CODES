import java.io.*;

public class Program3 {

    public static void main(String[] args)throws IOException {

       
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of an Array");
        int size=Integer.parseInt(br.readLine());
        int evenCount=0;
        int oddCount=0;
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){

            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount+=arr[i];
            }
            else{
                oddCount+=arr[i];
            }
        }

        System.out.println("Even sum is "+evenCount);
        System.out.println("odd sum is  "+oddCount);
    }
    
}
