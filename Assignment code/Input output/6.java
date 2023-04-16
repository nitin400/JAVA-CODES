import java.io.*;
import java.util.StringTokenizer;

class Pattern6 {

    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        char c1=(char)(br.read());
        br.skip(1);
        char c2=(char)br.read();


        if(c1==c2){
            System.out.println(c1+" "+c2);
        }
        else{
            System.out.println("The difference is="+(int)(c2-c1));
        }




        
        
    }
    
}
