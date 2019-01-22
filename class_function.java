package judge;

import java.util.Scanner;

public class class_function {
	public static void sum(int a, int b)
	{
		int i;
		int sum;
		sum = 0;
		for (i=a; i<=b; i++)
		{
			sum += i;
		}
		System.out.println(a+"到"+b+"的和是"+sum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		sum(1,  10);
		sum(20, 30);
		sum(35, 45);
	}
}