package Threading.com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo2 implements Callable{

	public Object call () throws Exception {
		System.out.println("call () -method executed...");
		return "success";
	}
 public static void main(String[] args) throws Exception {
	Demo d = new Demo ();
	ExecutorService exservice = Executors.newFixedThreadPool(10);
	
	for  (int i = 1;  i <= 15;  i++ ) {
		Future submit = exservice.submit (d);
		System.out.println(submit.get().toString());
	}
	exservice.shutdown();
}
}
