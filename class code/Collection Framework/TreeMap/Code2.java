import java.util.*;

class Platform implements Comparable{
    String str=null;
    int foundYear=0;
    Platform(String str, int foundYear){
        this.str=str;
        this.foundYear=foundYear;
    }

    public String toString(){
        return str;
    }
    public int compareTo(Object obj){
        return this.foundYear -(((Platform)obj).foundYear);
    }
}

class TreeMapDemo{
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();

        tm.put(new Platform("youtube",2010),"Google");
        tm.put(new Platform("Insta",2010),"Meta");
        tm.put(new Platform("Facebook",
        010),"Meta");
        tm.put(new Platform("chatgpt",2010),"OpenAI");
        tm.put(new Platform("youtube",2010),"Google");

        System.out.println(tm);
    }
}
