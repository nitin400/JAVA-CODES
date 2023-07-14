interface Demo{
    void gun();

    default void fun(){
        System.out.println("In Fun-Demo");
    }
}

class DemoChild implements Demo{
    public void gun(){
        System.out.println("In gun-Demo Child");
    }
}

class Client{
    public static void main(String[] args) {
        DemoChild obj=new DemoChild();
        obj.gun();
        obj.fun();
    }
}
