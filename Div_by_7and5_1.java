
public class Div_by_7and5_1 {
	public static void main(String[] args) {
		int i = 1500;
		while (i <= 2700) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
