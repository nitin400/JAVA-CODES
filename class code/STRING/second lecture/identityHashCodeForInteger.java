import javax.print.attribute.IntegerSyntax;

public class identityHashCodeForInteger{

    public static void main(String[] args){

        Integer x=1000;
        Integer y=1000;

        if(x.hashCode(x)==y.hashCode(y)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    
}