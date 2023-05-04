public class Program3 {

    public static void main(String []args){
        String str1="Nitin";
        String str2="Andhale";
        System.out.println(str1+str2);

        String str3="NitinAndhale";
        String str4=str1+str2; // jaga hi HEAP vrti melte na ki String Constant pool.
        
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
    
}
