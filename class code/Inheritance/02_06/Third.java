class Parent{
    static int x=10;

    static{
        System.out.println("In Parent static block");
    }

    static void access(){
        System.out.println(x);
    }
}

class Child extends Parent{
    static{
        System.out.println("In child static block");
        System.out.println(x);
        access();
    }
}

class Client{
    public static void main(String[] args) {
        System.out.println("In main");
        Child obj=new Child();
    }
}

