import java.io.*;


public class Program8 {

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
            int flag=0;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    flag=1;
                    

                }
            }
            if(flag==0){
                System.out.println("distinct elements are "+arr1[i]);
            }
         }



         //

         for(int j=0;j<arr1.length;j++){
            int flag=0;
            for(int i=0;i<arr2.length;i++){
                if(arr1[i]==arr2[j]){
                    flag=1;
                    

                }
            }
            if(flag==0){
                System.out.println("distinct elements are "+arr2[j]);
            }
         }
    }
    }
    


