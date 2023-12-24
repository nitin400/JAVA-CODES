
class MyThread implements Runnable {

	public void run() {

		try {for(int i=0;i<=5;i++){
			System.out.println("amruta");
			Thread.sleep(5000);
		}
		} catch (InterruptedException e) {

		}

	}
}

class Client {

	public static void main(String[] args) throws Exception{

		MyThread obj = new MyThread();

		Thread T1 = new Thread(obj);
		T1.start();

		System.out.println("end Main");
	}
}