package judge;

import java.util.Scanner;

public class task_7_2 {
	
	public static boolean isPerfect(int num)
	{
		boolean isperf = false;
		int sum = 0;
		for (int i=1; i<num; i++)
		{
			if (num % i == 0)
			{
				sum += i;
			}
		}
		if (sum==num)
		{
			isperf = true;
		}
		return isperf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int count = 0;
		int j=0;
		for (int i=n; i<=m; i++)
		{
			if (isPerfect(i))
			{
				count++;
			}
		}
		int [] result = new int[count];
		for (int i=n; i<=m; i++)
		{
			if (isPerfect(i))
			{
				result[j]=i;
				j++;
			}
		}
		for (int k=0; k<result.length-1;k++)
		{
			System.out.print(result[k]+" ");
		}
		System.out.print(result[result.length-1]);
	}
}