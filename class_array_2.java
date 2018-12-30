package judge;

import java.util.Scanner;

public class class_array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] numbers = new int[10];
		int n = in.nextInt();
		while (n != -1)
		{
			if (n>=0 && n<10)
			{
				numbers[n]++;
			}
			n = in.nextInt();
		}
		for (int i=0; i<numbers.length; i++)
		{
			System.out.println(i+"number£º"+numbers[i]);
		}

	}

}
