import java.util.ArrayList;

public class ForEachMethod{

    public static void main(String[] args) {
        
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        // for(int i:al){
        //     System.out.println(i);
        // }

        // we have advance way to do that...

        al.forEach(n->System.out.println(n)); 
        // There is consumer functional interface and we are using lambda expression here.
    }
}