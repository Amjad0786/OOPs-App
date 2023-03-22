package Daemon.in;

public class Demo implements Runnable {
 public void run () {
	 
	 if (Thread.currentThread().isDaemon()) {
		 System.out.println("Daemon Thread Executed...");
	 }else {
		 System.out.println("Normal Thread Executed...");
	 }
 }
 public static void main(String[] args) {
	Demo D =  new Demo ();
	Thread t1 = new Thread (D);
	t1.setDaemon(true);
     t1.start();
}
}
