import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class functionDemo {

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String args[])throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two numbers");
        String str=br.readLine();

        StringTokenizer st=new StringTokenizer(str," ");

        String token1=st.nextToken();
        String token2=st.nextToken();
        String token3=st.nextToken();

        int a=Integer.parseInt(token1);
        int b=Integer.parseInt(token2);
        int c=Integer.parseInt(token2);

        functionDemo fd=new functionDemo();
        fd.add(a,b);
        fd.add(a,b,c);


    }
    
}
