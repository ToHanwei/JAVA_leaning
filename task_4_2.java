package judge;

import java.util.Scanner;

public class task_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String sign = "";
		String [] word = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
		int num = in.nextInt();
		int temp = num;
		int mod, i = 0, count=0;
		boolean istrue = true;
		if (num < 0)
		{
			num = Math.abs(num);
			sign = "fu";
		}
		while (true)
		{
			temp /= 10;
			if (temp ==0)
			{
				count++;
				break;
			}
			count++;
		}
		String [] result = new String[count];
		while (istrue)
		{
			mod = num % 10;
			num = num / 10;
			if (num == 0)
			{
				istrue =false;
			}
			result[i] = word[mod];
			i++;
		}
		if (sign == "fu")
		{
			System.out.print(sign+" ");
		}
		for (int k=0; k<result.length-1; k++)
		{
			System.out.print(result[count-k-1]+" ");
		}
		System.out.print(result[0]);
	}

}
