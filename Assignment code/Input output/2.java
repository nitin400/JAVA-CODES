import java.io.*;
import java.util.*;



class Pattern2 {
    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

         

            int row=Integer.parseInt(br.readLine());

            System.out.println("Enter number of col");

            int col=Integer.parseInt(br.readLine());

            for(int i=1;i<=row;i++){
                for(int j=1;j<=col;j++){
                    if(j==i){
                        System.out.print("#"+" ");
                    }
                    else{
                        System.out.print("*"+" ");
                    }
                }
                System.out.println();
            }


        
        
    }
    
}
