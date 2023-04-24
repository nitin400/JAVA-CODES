import java.io.*;

public class Program5 {

    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of an array");
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }



        

    }
    
}
