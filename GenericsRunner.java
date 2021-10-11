import java.util.ArrayList;
import java.util.List;

import com.siddhi.Generics.MyList;

public class GenericsRunner {

	static double sumOfNumbers(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	static void addValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}

	public static void main(String[] args) {
		List el = new ArrayList<Number>();
		addValues(el);
		System.out.println(el);

		System.out.println(sumOfNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
		System.out.println(sumOfNumbers(List.of(1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1, 8.1, 9.1)));
		System.out.println(sumOfNumbers(List.of(1l, 2l, 3l, 4l, 5l, 6l, 7l, 8l, 9l)));
		MyList<String> list = new MyList<>();
		list.addElement("Siddhi");
		list.addElement("Sid");
		String val = list.get(0);
		System.out.println(list);
		System.out.println(val);

		MyList<Integer> list1 = new MyList<>();
		list1.addElement(Integer.valueOf(9));
		list1.addElement(Integer.valueOf(8));
		Integer val1 = list1.get(0);
		System.out.println(list1);
		System.out.println(val1);
	}

}
