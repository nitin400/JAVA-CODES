class parent{
    parent(){
        System.out.println("PARENT");
    }
}

class child extends parent{
    child(){
        System.out.println("child");
    }
    public static void main(String[] args) {
        parent obj=new child();
    }
}


