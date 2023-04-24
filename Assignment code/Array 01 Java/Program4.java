import java.io.*;

public class Program4 {

    

    public static void main(String []main)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of Array");
        int size=Integer.parseInt(br.readLine());
        char arr[]=new char[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=br.readLine().charAt(0);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='o' || arr[i]=='u'){
                System.out.println(arr[i]);
            }
        }
    }
    
}
