package Threading.com;

public class Demo implements Runnable{
	public void run () {
		System.out.println("run () method started...");
		
		
		try {
			Thread .sleep(5000); // Blocked state
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println("run () method ended...");
		
	}
	public static void main(String[] args) {
		Demo D = new Demo ();
		Thread  t = new Thread (D); //new state
		t.start();  //runnable state
	}

}
