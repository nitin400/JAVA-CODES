import java.rmi.server.SocketSecurityException;

class switchDemo {
    public static void main(String []args){
        int ch=65;

        switch(ch){
            case 'A':
                System.out.println("char - A");
                break;
            case 65:
                System.out.println("Num 65");
                break;
            default:
                System.out.println("NO match");
        }
    }
    
}
