import java.io.*;

public class ThirdCode {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(str);
        int x=0;
        try {

             x = Integer.parseInt(br.readLine());
        } catch (NumberFormatException obj) {
            System.out.println("Exception Occured");

        }

        System.out.println(x);
    }

}
