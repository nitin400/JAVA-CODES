import java.io.*;
public class Program6 {




    public static int Maxelement(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                
            }
        }

        return max;
    }


    public static void main(String []args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of an Array");

        int size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){

            arr[i]=Integer.parseInt(br.readLine());
        }
        

        System.out.println(Maxelement(arr));
    }
    


    
}
