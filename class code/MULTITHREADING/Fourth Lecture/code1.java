//ThreadPool

import java.util.concurrent.*;

class MyThread implements Runnable{
    int num;

    MyThread(int num){
        this.num=num;
    }

    public void run(){
        System.out.println(Thread.currentThread()+"start Thread "+num);
        dailyTask();
        System.out.println(Thread.currentThread()+"End Thread"+num);
    }

    void dailyTask(){
        try{
            Thread.sleep(8000);
        }catch(InterruptedException ie){

        }
    }
}

class ThreadPoolDemo{
    
    public static void main(String[] args) {
        ExecutorService ser=Executor.new Cachedthreadpool();

        for(int i=0;i<10;i++){
            MyThread obj=new MyThread(i);
            ser.execute(obj);
        }
        ser.shutdown();
    }
}