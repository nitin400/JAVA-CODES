class Parent{
    int x=10;
    Parent(){
        System.out.println("In parent constructor");
    }

    void access(){
        System.out.println("parent Instance");
    }
}

class Child extends Parent{
    int y=20;
    Child(){
        System.out.println("In child Constructor");
        System.out.println(x);
        System.out.println(y);
    }

}

class Client{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.access();
    }
}


//output:-
// In parent constructor
// In child Constructor
// 10
// 20
// parent Instance  