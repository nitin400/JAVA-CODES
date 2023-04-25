public class CACHEDEMO{

    public static void main(String[]args){
        int x=10;
        int y=10;
        Integer z=10;

        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        System.out.println(System.identityHashCode(z));
    }
}