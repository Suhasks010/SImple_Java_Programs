package numbers;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("***Strong Number Checker**");
		System.out.println("Enter Number to check: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		while(temp >0)
		{
			int dig = temp % 10;
			int fact = 1;
			for(int i = 1; i <= dig; i++)
			{
				fact *= i;
			}
			sum += fact;
			temp /= 10;
		}
		if(sum == num)
		{
			System.out.println("Strong number!");
		}
		else
		{
			System.out.println("Not a Strong number!");
		}
		
		sc.close();
	}

}
