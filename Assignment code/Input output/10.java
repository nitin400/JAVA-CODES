import java.io.*;

class Pattern10 {

    public static int isPrime(int n){
        int flag=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=1;
                break;

            }
        }
        if(flag==0){
            return 1;
        }
        return 0;
        
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a start of prime number");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter a end of prime number");
        int end = Integer.parseInt(br.readLine());

        for(int i=start;i<=end;i++){
            if(isPrime(i)==1)
            {
                System.out.print(i+" ");
            }
        }
        
        
    }
    
}
