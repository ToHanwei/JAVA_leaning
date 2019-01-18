package judge;

import java.util.Scanner;

public class task_7_1 {
	
	public static boolean isPrime(int num)
	{
		boolean isprime = true;
		for (int i=2; i<= Math.sqrt(num); i++)
		{
			if (num % i ==0)
			{
				isprime = false;
				break;
			}
		}
		return isprime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int mul =1;
		System.out.print(number+"=");
		if (isPrime(number))
		{
			System.out.println(number);
		}
		else
		{
			int j = 2;
			int temp = number;
			while (true)
			{
				if (temp % j == 0)
				{
					mul *= j;
					if (mul == number)
					{
						System.out.print(j);
						break;
					}
					else
					{
						temp = temp/j;
						System.out.print(j+"x");
					}
				}
				else
				{
					j++;
				}
			}
		}
	}

}
