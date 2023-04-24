import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program7 {

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the size");
        int size=Integer.parseInt(br.readLine());

        int arr1[]=new int[size];
        int arr2[]=new int[size];

        System.out.println("Enter the first array elements ");

        for(int i=0;i<arr1.length;i++){

            arr1[i]=Integer.parseInt(br.readLine());
        }
         System.out.println("Enter the second array elements");

         for(int i=0;i<arr2.length;i++){
            arr2[i]=Integer.parseInt(br.readLine());
         }

         for(int i=0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);

                }
            }
         }
    }
    }
    

