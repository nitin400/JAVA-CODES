import java.io.*;
public class FourthCode {

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int data=0;
        try{
            data=Integer.parseInt(br.readLine());
        }catch(NumberFormatException obj){
            System.out.println("Please Enter Integer data ");
            data=Integer.parseInt(br.readLine());
        }

        //System.out.println(data);
        
        System.out.println(data);


    }
    
}
