import java.io.*;

public class FileDemo2 {

    public static void main(String[] args) throws IOException {

        File f = new File("Incubator.txt");

        FileWriter fw = new FileWriter(f, false);

        fw.write("Testing");
        fw.write("Dev ops");
        fw.write("SalesForce");

        fw.close();

    }
}
