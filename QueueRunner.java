package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String val1, String val2) {
		return Integer.compare(val1.length(), val2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> qu = new PriorityQueue<>(new StringLengthComparator());
		qu.addAll(List.of("Siddhi", "Ruturaj"));
		System.out.println(qu.poll());
		System.out.println(qu.poll());
	}

}
