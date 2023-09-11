package numbers;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting and ending range: ");
		int ir = sc.nextInt();
		int fr = sc.nextInt();
		
		System.out.println("The prime numbers within range "+ir+" and "+fr+ " are: ");
		for(int i= ir; i<=fr; i++)
		{
			boolean isPrime = true;
			for(int j =2; j<=(i/2); j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
				}
			}
			if(isPrime == true)
			{
				System.out.println(i);
			}
		}
		sc.close();

	}

}
