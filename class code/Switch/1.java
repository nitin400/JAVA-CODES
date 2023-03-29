class switchDemo{
    public static void main(String args[]){
        int x=3;

        switch(x){
            case 1:
                System.out.println("one");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");

            case 4:
                System.out.println("Four");

            case 5:
                System.out.println("Five");

            default:
                System.out.println("No match");
        }
        System.out.println("After switch");
    }
}