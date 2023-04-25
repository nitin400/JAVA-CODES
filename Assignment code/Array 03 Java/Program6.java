import java.io.*;


public class Program6{
    public static int Palindrome(int n){
      
        int temp=n;
        int rev=0;
        

        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }

        if(rev==temp){
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

            if(Palindrome(arr[i])>0){
                System.out.println("Palindrome number "+arr[i]+" found at index "+i);
            }
            
        }
    }
}

