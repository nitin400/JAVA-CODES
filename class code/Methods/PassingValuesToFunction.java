import java.io.*;
import java.util.StringTokenizer;

public class PassingValuesToFunction {
    static void add(int a, int b) {
        int ans = a + b;
        System.out.println(ans);
    }

    static void mult(int a, int b) {
        int ans = a * b;
        System.out.println(ans);
    }

    static void div(int a, int b) {
        int ans = a / b;
        System.out.println(ans);
    }

    static void sub(int a, int b) {
        int ans = a - b;
        System.out.println(ans);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two integer values");
        String s = br.readLine();
        StringTokenizer str = new StringTokenizer(s, " ");

        String a = str.nextToken();
        String b = str.nextToken();

        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);

        add(a1, b1);
        mult(a1, b1);
        div(a1, b1);
        sub(a1, b1);
    }

}
