package judge;

import java.util.Scanner;

public class task_5_1 {
	
	public static int[] arry_pow(boolean iskeep) {
		Scanner in = new Scanner(System.in);
		int [] array = new int[101];
		int count = 0;
		int i;
		int key=0;
		while (iskeep)
		{
			i = in.nextInt();
			count++;
			if (count%2==1)
			{
				key = i;
			}
			else
			{
				array[key] = i;
				if (key == 0)
				{
					break;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] first = new int[101];
		int [] second = new int[101];
		int temp;
		boolean iskeep = true;
		first = arry_pow(iskeep);
		second = arry_pow(iskeep);
		for (int i=first.length-1; i>0 ; i--)
		{
			if (((first[i]!=0) || (second[i]!=0)))
			{
				if (i == 1)
				{
					System.out.print((first[i]+second[i])+"x"+"+");
					continue;
				}
				System.out.print((first[i]+second[i])+"x"+i+"+");
			}
			
		}
		System.out.print(first[0]+second[0]);
	}

}
