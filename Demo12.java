
public class Demo12 implements Runnable {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Executed...");
		}else {
			System.out.println("Normal Thread Executed...");
		}
	}
	public static void main(String[] args) {
		Demo12 d =new Demo12();
		Thread t1 = new Thread(d);
		t1.setDaemon (true);
		t1.start();
	}

}
