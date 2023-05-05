import java.io.*;


public class sameLength {

    public static int mylen(String str){
        int count=0;

        for(int x:str.toCharArray()){
            count++;
        }
        return count;
    }

    public static void main(String []args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first string");
        String str1=br.readLine();
        System.out.println("Enter second String");
        String str2=br.readLine();

        if(mylen(str2)==mylen(str1)){
            System.out.println("Same length");
        }
        else{
            System.out.println("Not same");
        }
    }
    
}
