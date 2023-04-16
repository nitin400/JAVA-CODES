import java.io.*;

class Pattern5 {
    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a rows ");

        int row=Integer.parseInt(br.readLine());

        int a=-1;
        int b=1;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
               int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
            System.out.println();
        }
        
    }
    
}
