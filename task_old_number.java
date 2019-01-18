package judge;

import java.util.Scanner;

public class task_old_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int odd_count = 0, even_count = 0, Step;		
		while (true)
		{
			Step = in.nextInt();
			if (Step == -1) 
				break;
			if ((Step % 2) == 0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}
		System.out.println(odd_count+" "+even_count);

	}

}
