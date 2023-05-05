public class capacityOfStringBuffer {

    public static void main(String[] args){
        StringBuffer str1=new StringBuffer("asdf");
        System.out.println(str1.capacity());
        str1.append("aniketnagpurenitinandhale");

        System.out.println(System.identityHashCode(str1));
        str1.append("Bagal");
        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));
        
        // capacity..
        System.out.println(str1.capacity());
        //System.out.println(str2.capacity());
    }
    
}


