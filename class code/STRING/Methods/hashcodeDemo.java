public class hashcodeDemo {

    public static void main(String []args){

        String str="Nitin";

        if(System.identityHashCode(str)!=0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
}
