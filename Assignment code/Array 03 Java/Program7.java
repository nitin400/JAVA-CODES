import java.io.*;


public class Program7{
    public static int StrongNumber(int n){
        int fact=0;
        int temp=n;
        while(n>0){
            int rem=n%10;

            for(int i=1;i<=rem;i++){
                if(rem%i==0){
                    fact+=i;
                }
           }
           n=n/10;

        }

        if(fact==temp){
            return 1;
        }
        return 0;
       
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

            if(StrongNumber(arr[i])>0){
                System.out.println("Strong  number "+arr[i]+" found at index "+i);
            }
            
        }
    }
}

