class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
        MyThread obj=new MyThread();
        obj.start();

        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println("exception occured");
        }
        
        System.out.println(Thread.currentThread());
    }
}

class Demo{

    public static void main(String[] args){
        MyThread obj=new MyThread();
        obj.start();
    }
}