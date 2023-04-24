import java.io.*;

public class Program9 {


    public static void main(String []args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size");

        int size=Integer.parseInt(br.readLine());

        int arr1[]=new int[size];
        int arr2[]=new int[size];
        int arr3[]=new int[2*size];
        System.out.println("Enter first Array's element");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter Second Array's element");

        for(int i=0;i<arr2.length;i++){
            arr2[i]=Integer.parseInt(br.readLine());
        }

        // merging  two arrays..

        for(int i=0;i<(2*size);i++){
            if(i<size){
                arr3[i]=arr1[i];
            }
            else{
                arr3[i]=arr2[i-size];
            }
        }

        for(int i=0;i<2*size;i++){
            System.out.println(arr3[i]);
        }
    }
    
}
