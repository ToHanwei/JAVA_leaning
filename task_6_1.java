package judge;

import java.util.Scanner;

public class task_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true)
		{
			String word = in.next();
			if (word.endsWith("."))
			{
				System.out.print((word.length()-1));
				break;
			}
			else 
			{
				System.out.print(word.length()+" ");
			}
		}

	}

}
