
class Task1 extends Thread {
	
	
	public void run() {
		// Task 1
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		// Task1
		Task1 ob = new Task1();
		ob.setPriority(1);
		ob.start();

		System.out.println();
		// Task 2
		Task2 ob1 = new Task2();
		Thread task2Thread = new Thread(ob1);
		task2Thread.setPriority(10);
		task2Thread.start();

		// wait for task 1 and 2 to complete
		ob.join();
		task2Thread.join();
		
		System.out.println();
		// Task 3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
	}

}
