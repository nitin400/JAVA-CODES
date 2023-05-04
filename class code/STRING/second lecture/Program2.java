public class Program2 {

    public static void main(String []args){
        String str1="Kanha";
        String str2=str1;
        String str3=new String(str2);//hyala jaga heap vrti bhete..

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
    }
    
}
