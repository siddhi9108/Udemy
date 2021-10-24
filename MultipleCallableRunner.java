import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ob = Executors.newFixedThreadPool(1);
		List<CallableTask> task = List.of(new CallableTask("Siddhi"), new CallableTask("Prashant"),
				new CallableTask("Amilkanthwar"));
		List<Future<String>> result = ob.invokeAll(task);
		for (Future<String> res : result) {
			System.out.println(res.get());
		}
		ob.shutdown();
	}

}
