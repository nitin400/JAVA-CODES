public class staticDemo {
    void fun(){
        System.out.println("non-static");
    }

    static void fun1(){
        System.out.println("static");
    }

    int x=5;
    static int y;

    public static void main(String []args){
        staticDemo obj=new staticDemo();
        obj.fun();
        obj.x=90;
        fun1();
        y=5;

    }
    
}
