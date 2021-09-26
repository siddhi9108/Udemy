package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscStudentComarator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> ob = List.of(new Student(1, "Siddhi"), new Student(100, "Adam"), new Student(2, "Eve"));
		ArrayList<Student> ob2 = new ArrayList<>(ob);
		System.out.println(ob);
		Collections.sort(ob2);
		System.out.println("Desc " + ob2);
		ob2.sort(new AscStudentComarator());
		// Collections.sort(ob2, new AscStudentComarator());
		System.out.println("AscStudentComarator" + ob2);
	}

}
