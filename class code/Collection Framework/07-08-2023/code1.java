import java.util.*;

class CricPlayer{
    int jerNo=0;
    String name=null;
    CricPlayer(int jerNo, String name){
        this.jerNo=jerNo;
        this.name=name;
    }
    public String toString(){
        return name;
    }
}

class ArrayListDemo{
    
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add(new CricPlayer(18, "Virat"));
        al.add(new CricPlayer(7,"dhoni"));
        al.add(new CricPlayer(45,"Rohit"));

        System.out.println(al);

    }
}