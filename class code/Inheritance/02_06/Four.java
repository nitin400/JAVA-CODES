
class Parent{
    int x=10;
    static int y=20;

    static{
        System.out.println("Parent Static Block");
    }

    Parent(){
        System.out.println("In constructor");
    }

    void methodOne(){
        System.out.println(x);
        System.out.println(y);
    }
    static void methodTwo(){
        System.out.println(y);
    }

}

class Child extends Parent{
    static{
        System.out.println("In child");
    }

    Child(){
        System.out.println("In child Constructor");
    }
}

class Client{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.methodOne();
        obj.methodTwo();
    }
}
