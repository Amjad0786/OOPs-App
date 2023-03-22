import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo8 implements Callable {

	@Override
	public Object call() throws Exception {
		System.out.println("call ()- method executed...");
		return "success";
	}
	public static void main(String[] args) throws  Exception {
		Demo8 d = new Demo8();
		ExecutorService exService = Executors.newFixedThreadPool(10);
		
		for (int i=1; i<=15; i++) {
			Future submit = exService.submit(d);
		System.out.println(submit.get().toString());
		exService.shutdown();
		}
	}

}
