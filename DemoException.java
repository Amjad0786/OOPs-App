
public class DemoException {
 public static void main(String[] args) {
	 System.out.println("main () method started...");
	 
	 try {
		 System.out.println("try block start");
		 String s = null; //if initialize amjad then try block end 
		 s.length();
		 System.out.println("try block end");
	 }catch (Exception e) {
		 System.out.println("in catch block");
	 }
	 System.out.println("main () method ended...");
}
}
