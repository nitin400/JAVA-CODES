import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        Stream<Integer> s1=al.stream();
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*2);
        int result=s3.reduce(0, (c,e)->c+e);

        System.out.println(al.stream().filter(n->n%2==0).map(n->n*2).reduce(0, (c,e)->c+e));
        // ek stream ekdach vapru shaktot
        //various methods aahet.
    }
}
