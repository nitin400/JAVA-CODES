

class sailor{
    private String name;
    private int age;
    public sailor(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Engineer extends sailor{
    private String specialization;
    
    public Engineer(String name, int age, String specialization){
        super(name,age);
        this.specialization=specialization;
    }
}

class client{
    public static void main(String[] args) {
        Engineer IT= new Engineer("NITIN", 20, "IT");
    }
}