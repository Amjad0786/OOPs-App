
public class Demo2 {
 public static void main(String[] args) {
	System.out.println("main() method started");
 try {
	 System.out.println("try block start");
	 String s = null;
	 int i = s.length();
	 System.out.println("try block end");
     } catch (ArithmeticException e) {
    	 System.out.println("in catch block");
    	 e.printStackTrace();
     }catch (NullPointerException e) {
     e.printStackTrace ();
}catch (Exception e) {
	e.printStackTrace();
}
 System.out.println("main () method ended");
 
 }
}
