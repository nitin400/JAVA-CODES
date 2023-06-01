class parent{
    parent(){
        System.out.println(this);
        System.out.println("In parent constructor");
    }

    void parentProperty(){
        System.out.println("flat, car , gold");
    }
}

class child extends parent{



    child(){
        System.out.println(this);
        System.out.println("In child constructor");
    }
}

class client{
    public static void main(String[] args) {
        // child obj2= new child();
        parent obj3=new child();
        System.out.println(obj3);
        
        // obj2.parentProperty();
    }
}