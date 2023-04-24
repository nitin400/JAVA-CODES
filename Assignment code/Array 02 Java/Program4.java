import java.io.*;

public class Program4 {

    public static int search(int arr[],int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }

        return -1;
    }


    public static void main(String []args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of an Array");

        int size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){

            arr[i]=Integer.parseInt(br.readLine());
        }
        int key=5;

        System.out.println(search(arr,key));
    }
    
}
