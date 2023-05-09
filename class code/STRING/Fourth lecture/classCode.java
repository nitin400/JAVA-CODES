public class classCode{
    public static void main(String[] args){

        StringBuffer sb=new StringBuffer(); // hya madhe don type aahet string assign nahi keli tr capacity tevdhich rahite important point aahe
        System.out.println(sb.capacity());//16
        System.out.println(sb);             //Blank

        sb.append("shashi");
        System.out.println(sb.capacity()); // 16
        System.out.println(sb);             //shashi

        sb.append("Bagal");
        System.out.println(sb.capacity());//16
        System.out.println(sb);             // shashi Bagal

        sb.append("Core2web");
        System.out.println(sb.capacity());//34
        System.out.println(sb);             //shashiBagalCore2Web
    }
}