package judge;

import java.util.Scanner;

public class task_5_1_1 {
	
	public static void printResult(int m, int c)
	{
		if (m != 0)
		{
			if (c != 0)
			{
				System.out.print(c);
			}
			System.out.print("x");
			if (m != 1)
			{
				System.out.print(m);
			}
		}
		else
			{
				System.out.print(c);
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] num = new int[101];
		int m = 0;
		int c = 0;
		int count = 0;
		boolean isFirstOut = true;
		
		for (int i=0; i<2; i++)
			do
			{
				m = in.nextInt();
				c = in.nextInt();
				num[m] += c;
			} while (m != 0);
		
		for (int i=100; i>=0; i--)
		{
			m = i;
			c = num[i];
			
			if (c!=0)
			{
				count ++;
				if (isFirstOut)
				{
					printResult(m, c);
					isFirstOut = false;
				}
				else
				{
					if (c>0)
					{
						System.out.print("+");
					}
					printResult(m, c);
				}
			}
		}
		if (count == 0)
		{
			System.out.print("0");
		}
	}

}
