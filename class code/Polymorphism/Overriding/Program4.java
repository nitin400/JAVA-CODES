class Parent{
    Parent(){
        System.out.println("In parent constructor");
    }

    void fun(){
        System.out.println("In parent fun");
    }
}

class Child extends Parent{

    Child(){
        System.out.println("In child Constructor");
    }

    void fun(int x){
        System.out.println("In child function");
    }
}

class Client{
    public static void main(String[] args) {
        Parent obj1=new Child();
        obj1.fun();
    }
}
