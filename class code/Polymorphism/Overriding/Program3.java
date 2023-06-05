class Parent{
    Parent(){
        System.out.println("Parent constructor");
    }

    void fun(){
        System.out.println("In Parent function");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("In child constructor");
    }
    void fun(){
        System.out.println("In child Function");
    }

}

class Client{
    public static void main(String[] args) {
        Parent obj=new Child();
        obj.fun();
    }
}