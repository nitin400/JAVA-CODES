import java.io.*;


public class Program1{
     public static int sumOfArray(int arr[]){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum;

        }

    public static void main(String[] args)throws IOException {

       
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of an Array");
        int size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){

            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println(sumOfArray(arr));
    }
}