import java.util.Scanner;

public class Random_bet_1to10 {

	public static void main(String[] args) {
		Scanner ob1 = new Scanner(System.in);
		int ans = 1 + (int) (10 * Math.random());
		for (int i = 0; i < 10; i++) {
			System.out.println("Guess no.");
			int x = ob1.nextInt();
			if (ans == x) {
				System.out.println("Right");
			}
		}
		System.out.println("No. was" + ans);
	}

}
