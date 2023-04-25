import java.io.*;


public class Program1{
    public static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
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

            System.out.println(count(arr[i]));
        }
    }
}