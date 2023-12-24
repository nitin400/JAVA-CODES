
import java.io.*;

public class FileDemo1{

    public static void main(String[] args) throws IOException{

        FileWriter fw=new FileWriter("Incubator.txt");

        fw.write("Flutter");
        fw.write("Backend");
        fw.write("Frontend");
        fw.close();
        
    }
}