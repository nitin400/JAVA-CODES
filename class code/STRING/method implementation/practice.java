public class practice {


    public static String Replace(String str,char old,char neww){

        char arr[]=str.toCharArray();

        for(int i=0;i<arr.length;i++){

            if(arr[i]==old){
                
                arr[i]=neww;
                continue;

            }
        }
        String str2=new String(arr);

        return str2;



    }
    public static void main(String[] args) {

        String str = " nitin  ";
        // char arr[]=str.toCharArray();
        // String str1=arr.toString();
        // System.out.println(str1);

        System.out.println(Replace(str, 'i', 'k'));


    }

}
