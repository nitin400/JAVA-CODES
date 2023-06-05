package Overriding;

class Program1 {
    Program1(){
        System.out.println("Parent class");
    }

    void property(){
        System.out.println("Home , car , gold");
    }

    void marry(){
        System.out.println("Deepika");
    }
    
}

class child extends Program1{
    child(){
        System.out.println("Child Constructor");
    }

    void marry(){
        System.out.println("Alia bhatt");
    }
}

class client{
    public static void main(String[] args) {
        child obj=new child();
        obj.property();
        obj.marry();
    }
}
