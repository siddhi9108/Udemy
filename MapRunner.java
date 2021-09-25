package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String s = "This is an awesome occasion. This is what I want";
		Map<Character, Integer> ob = new HashMap<>();
		char[] chars = s.toCharArray();
		for (char character : chars) {
			Integer inte = ob.get(character);
			if (inte == null) {
				ob.put(character, 1);
			} else {
				ob.put(character, inte + 1);
			}
			//C:\Users\admin\eclipse-workspace\Generics
		}
		System.out.println(ob);
		Map<String, Integer> ob1 = new HashMap<>();
		String[] s1 = s.split(" ");

		for (String character : s1) {
			Integer inte = ob1.get(character);
			if (inte == null) {
				ob1.put(character, 1);
			} else {
				ob1.put(character, inte + 1);
			}
		}
		System.out.println(ob1);
	}

}
