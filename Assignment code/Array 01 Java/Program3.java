
import java.io.*;
public class Program3 {

    public static int productOfOdd(int arr[]){
        int pro=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                pro=pro*arr[i];
            }
        }
        return pro;



    }


    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];

        System.out.println("Enter the elements..");

        for(int i=0;i<arr.length;i++){

            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("The odd array element sum is ="+productOfOdd(arr));
        

    }
    
}
