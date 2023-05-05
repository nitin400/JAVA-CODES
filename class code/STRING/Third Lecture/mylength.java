public class mylength{
    public static int mylengthfun(String str){
        int count=0;
        //char arr[]=str.toCharArray();
        for(char x:str.toCharArray()){
            System.out.println(x);`
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        String str="Nitin";
        System.out.println(mylengthfun(str));
    }
}