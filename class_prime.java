package judge;

import java.util.Scanner;

public class class_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for (int i=2; i<n; i++)
		{
			if (n % i == 0)
			{
				isPrime = 0;
				break;
			}
		}
		if (isPrime == 0)
		{
			System.out.print(n+"不是素数");
		}
		else
		{
			System.out.println(n+"是素数");
		}
	}

}
