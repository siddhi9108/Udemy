import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int n;

	public Task(int n) {
		this.n = n;
	}

	public void run() {
		System.out.println("\nTask" + n + " Started");
		for (int i = n * 100; i <= n * 100 + 99; i++) {
			System.out.println("\nTask" + n + " Done");
		}
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// ExecutorService ob = Executors.newSingleThreadExecutor();
		ExecutorService ob = Executors.newFixedThreadPool(2);
		ob.execute(new Task(1));
		ob.execute(new Task(2));
		ob.execute(new Task(3));
		ob.execute(new Task(4));

	}

}
