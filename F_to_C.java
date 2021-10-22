import java.util.Scanner;

public class F_to_C {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		double c, f;
		int x;
		System.out.println("Which case?: \n1.C to F \n2.F to C");
		x = ob.nextInt();
		switch (x) {
		case 1:
			System.out.println("Enter C temp:");
			c = ob.nextDouble();
			f = ((9 * c) / 5) + 32;
			System.out.println("Result: " + f);
		case 2:
			System.out.println("Enter F temp:");
			f = ob.nextDouble();
			c = (f - 32) * 5 / 9;
			System.out.println("Result: " + c);
		default:
			System.out.println("Invalid");
		}
	}

}
