import java.io.*;

import java.util.*;

public class Tokenjava {
    public static void main(String []args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your info ");

        String st=br.readLine();
        
        StringTokenizer t=new StringTokenizer(st," ");
        String token1= t.nextToken();
        String token2=t.nextToken();
        String token3=t.nextToken();
        System.out.println(token1);
        System.out.println(token2);
        System.out.println(token3);
    }
    
}
