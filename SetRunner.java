package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		// unique-set
		// Sorted- TreeSet
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println(treeSet);

		// insertion Order - LinkedHashSet
		Set<Character> linkedhash = new LinkedHashSet<>(characters);
		System.out.println(linkedhash);

		// No sorted and insertion order - HasSet
		Set<Character> hashset = new HashSet<>(characters);
		System.out.println(hashset);
	}

}
