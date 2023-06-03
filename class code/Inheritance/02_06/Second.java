//Static in Parent Class

class Parent{
 
    static{
        System.out.println("In parent static block");
        
    }
   

  
}

class Child extends Parent{

    static{
      
        System.out.println("in Child static Block");
    }
}

class Client{
    public static void main(String[] args) {
        Child obj=new Child();
        
    }
}
