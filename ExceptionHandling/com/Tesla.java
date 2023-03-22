package ExceptionHandling.com;

public class Tesla {
	
	public static void main(String[] args) throws NullPointerException {
		System.out.println("main() method started...");
		try {
			System.out.println("try block start");
			String s = "hi" ;
			int i = s.length();
			System.out.println("try block end");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("first catch");
		}
		System.out.println("main() method ended");
	}

}
