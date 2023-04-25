public class Program5 {

    public static void fun(int arr[]){
        for(int x:arr){
            System.out.println(x);
        }

        for(int i=0;i<arr.length;i++){
            arr[i]+=50;
        }
    }

    public static void main(String []args){

        int arr[]={50,100,150};
        fun(arr);

        for(int x:arr){
            System.out.println(x);
        }
    }
    
}
