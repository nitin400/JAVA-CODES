import java.io.*;


public class Program2{
    public static int reverse(int n){
        int rev=0;
        while(n>0){
        int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args)throws IOException{

        System.out.println("Enter the size of the Array");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());

        }

        for(int i=0;i<arr.length;i++){

            System.out.println(reverse(arr[i]));
        }
    }
}