package numbers;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("***Armstrong number Checker***");
		System.out.println("Enter a number to check: ");
		int num = sc.nextInt();
		int temp = num;
		int temp1 = num;
		int count = 0;
		int sum = 0;
		while (temp > 0) {
			count++;
			temp /= 10;
		}

		while (temp1 > 0) {
			int dig = temp1 % 10;
			int prod = 1;
			for (int i = 1; i <= count; i++) {
				prod *= dig;
			}
			sum += prod;
			temp1 /= 10;
		}
		if (num == sum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not armstrong number");
		}

		sc.close();

	}

}
