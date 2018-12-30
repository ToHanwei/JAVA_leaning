package judge;

import java.util.Scanner;

public class class_array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] numbers= new int[100];
		int i = 0, sum = 0;
		int n = in.nextInt();
		while (n != -1)
		{
			numbers[i] = n;
			sum += numbers[i];
			i++;
			n = in.nextInt();
		}
//		System.out.println(numbers.length);
		double average = (double)sum / i;
		System.out.println("Æ½¾ùÊı£º"+average);
		for (int j=0; j < i; j++ )
		{
			if (numbers[j] > average)
			{
				System.out.print(numbers[j]+" ");
			}
		}

	}

}