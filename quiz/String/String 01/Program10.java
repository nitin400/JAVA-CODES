public class Program10 {
    public static void main(String[] args) {
        
        String svar1="This is a string";

        String svar2="This is a string";

        if(System.identityHashCode(svar2)==System.identityHashCode(svar1)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
    
}
