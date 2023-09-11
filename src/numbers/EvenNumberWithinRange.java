package numbers;

import java.util.Scanner;

public class EvenNumberWithinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("***Even numbers within the range***");
		System.out.println("Enter starting and ending range: ");
		int ir = sc.nextInt();
		int fr = sc.nextInt();

		for (int i = ir; i <= fr; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
