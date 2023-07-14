class Outer {
    Object m1(){
        System.out.println("In m1-outer");
        class Inner{
            void m1(){
                System.out.println("In m1-Inner");
            }
        }
        return new Inner();
    }


    
}

class Client{
    public static void main(String[] args){
        Outer obj=new Outer();
        obj.m1().m1();
    }
}