import java.io.*;


public class Program5{
    public static int Composite(int n){
        int count=0;
        int temp=n;
        int sum=0;
        
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==temp){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args)throws IOException{

        System.out.println("Enter the size of the Array");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());

        }

        for(int i=0;i<arr.length;i++){

            if(Composite(arr[i])>0){
                System.out.println("Perfect number "+arr[i]+" found at index "+i);
            }
            
        }
    }
}

