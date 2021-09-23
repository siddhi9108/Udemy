import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ob = Executors.newFixedThreadPool(1);
		List<CallableTask> task = List.of(new CallableTask("Siddhi"), new CallableTask("Prashant"),
				new CallableTask("Amilkanthwar"));
		String result = ob.invokeAny(task);

		System.out.println(result);

		ob.shutdown();
	}

}
