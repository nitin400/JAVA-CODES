import java.io.*;

class Pattern9 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());
        int n=num;
        int sum=0;
        while(n>0){

            int rem=n%10;
            for(int i=1;i<=rem;i++){
                if(rem%i==0){
                    sum=sum+i;
                }
                
            }
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
