class Person {

    public static void main(String[] args) {

        Agriculture obj = new Agriculture();
        System.out.println(obj.number_of_animals);
        System.out.println(obj.number_of_hector);
        obj.foodSecurity();

    }
}

class Agriculture {

    double number_of_hector = 150.00;
    int number_of_animals = 10;

    void foodSecurity() {
        int spendmoney = 5000;
        String food_name = "chiku";
    }

}
