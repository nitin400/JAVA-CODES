import java.io.*;


public class Program10 {

    public static int addDigit(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;

        }
        return sum;
    }

    public static void main(String []args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of an Array");

        int size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i=0;i<arr.length;i++){

            if(addDigit(arr[i])%2==0){
                System.out.println(arr[i]);
            }
            
        }
    }
    
}
