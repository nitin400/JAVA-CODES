import java.util.*;
public class Program1 {

    public static void main(String []args){

        String str1="shahi";
        String str3="bagal";

        String str2=str1+str3; // he internally append method la call krte ji StringBuilder class chi method he.
        String str4=str1.concat(str3);

        System.out.println(str2);
        System.out.println(str4);
    }
    
}
