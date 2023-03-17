 class Core2web {
    public static void main(String[] args) {
        System.out.println("Before for loop");

        for(int i=0,j=0; i<1; j++){
            System.out.println("Inside for");
        }
        System.out.println("After for loop");
    }
    
}

//goes in infanite loop because i is not incrementing or decrementing 
