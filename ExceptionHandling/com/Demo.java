package ExceptionHandling.com;

public class Demo {
	public static void main(String[] args) {
		System.out.println("main () method started...");
		
		try {
			System.out.println("try block start");
			String s = null;
			s.length();
			System.out.println("try block end");
		}catch (Exception e) {
			System.out.println("in catch block");
			e.printStackTrace();
		}
		System.out.println("mein () method ended");
	}

}
