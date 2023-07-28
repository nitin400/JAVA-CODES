class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In run");

            try{
                Thread.sleep(10000);
            }catch(InterruptedException ie){

            }
        }
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        obj.start();

        for(int i=0;i<10;i++){
            System.out.println("In main");
        }
    }
}