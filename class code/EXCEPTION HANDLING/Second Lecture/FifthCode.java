public class FifthCode{
    void m1(){

    }
    void m2(){

    }

    public static void main(String[] args) {
        FifthCode obj=new FifthCode();

        obj.m1();
        obj=null;
        try{
            obj.m2();
        }catch(ArithmeticException obj4){
            System.out.println("Hello");
        }
        finally{
            System.out.println("Connection closed ");
        }
    }
}