class MyThread{
    
    public void run(){
        try{
            nmMain.join();
        }
        catch(InterruptedException obj){

        }
        for(int i=0;i<10;i++){
            System.out.println("In Thread-0");
        }
    }
}

class Demo{
    public static void main(String[] args) {
        MyThread.nmMain=Thread.currentThread();
        MyThread.obj=new MyThread();
        obj.start();
        obj.join();

        for(int i=0;i<10;i++){
            System.out.println("In main");
        }
    }
}
