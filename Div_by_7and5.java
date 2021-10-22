import java.util.Scanner;

public class Div_by_7and5 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int x = ob.nextInt();
		if (x % 7 == 0 && x % 5 == 0 && x >= 1500 && x <= 2700) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
