import java.io.*;
import java.io.IOException;

class Pattern3 {

    public static void main(String[] args)throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of rows");

        int row=Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++){
            

            for(int j=1;j<=(row+1)-i;j++){

                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
