class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }

    void fun() {
        System.out.println("In function");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("child  Constructor");
    }

    void gun() {
        System.out.println("In gun");
    }
}

class Client {
    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.fun();
        obj1.gun();
        Parent obj2 = new Parent();
        obj2.fun();
        obj2.gun();// ithe compiler fact left side la check krto to method table aahe ka nahi te mg
                   // to new gola banlyavr tyagolyatlya function la access krt asto
    }
}
