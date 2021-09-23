import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String n;

	public CallableTask(String n) {
		this.n = n;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + n;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ob = Executors.newFixedThreadPool(1);
		Future<String> wF = ob.submit(new CallableTask("Siddhi"));
		System.out.println("\n new CallableTask(\"Siddhi\")executed");
		String WM = wF.get();
		System.out.println(WM);
		System.out.println("\nMain Completed");
	}

}
