
public class Danish implements Runnable {
	public synchronized void printNums() {
		for (int i =1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+"=>"+i);
			
			
		try{
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		}

}
public void run() {
	printNums();
}
  public static void main(String[] args) {
	Danish d = new Danish();
	Thread t1  = new Thread(d);
	t1.setName ("ashraf");
	t1.start();
	
	Thread t2 = new Thread (d);
	t2.setName("amjad");
	t2.start();
}
	
	}
