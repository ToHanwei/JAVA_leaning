package judge;

import java.util.Scanner;

public class class_array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] data = {1, 2, 3, 4, 0, 5, 6, 7, 8, 9};
		int loc = -1;
		int num = in.nextInt();
		for (int i=0; i<data.length; i++)
		{
			if (num == data[i])
			{
				loc = i;
				break;
			}
		}
		if (loc > -1)
		{
			System.out.println(num+"在数组第"+(loc+1)+"位");
		}
		else
		{
			System.out.println(num+"不在数组里面");
		}

	}

}