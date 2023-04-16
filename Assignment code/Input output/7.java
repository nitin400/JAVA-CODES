import java.io.*;
import java.io.IOException;

class Pattern7 {
    public static void main(String[] args) throws IOException{


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of rows");

        int row=Integer.parseInt(br.readLine());
        int k=row*(row+1)/2;

        if(row%2!=0){

            for(int i=1;i<=row;i++){
                for(int j=1;j<=i;j++){
                    if(i%2==0){
                        System.out.print(k-- +" ");
                    }
                    else{
                        System.out.print((char)(64+k)+" ");
                        k--;
                    }
                }
                System.out.println();
            }
        }


        else{
            for(int i=1;i<=row;i++){
                for(int j=1;j<=i;j++){
                    if(i%2==0){
                        System.out.print((char)(64+k) +" ");

                        k--;
                    }
                    else{
                        System.out.print(k+" ");
                        k--;
                    }
                }
                System.out.println();
            }
        }
        
    }
    
}
