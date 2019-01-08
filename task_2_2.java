package judge;

import java.util.Scanner;

public class task_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int temp = in.nextInt();
		int R = (int)(temp / 10);
		int S = (int)(temp % 10);
		String Rs="", Ss="";
		switch (R)
		{
		case 1:
			Rs = "unreadable";
			break;
		case 2:
			Rs = "barely readable, occasional words distinguishable";
			break;
		case 3:
			Rs = "readable with considerable difficulty";
			break;
		case 4:
			Rs = "readable with practically no difficulty";
			break;
		case 5:
			Rs = "perfectly readable";
			break;
		}
		switch (S)
		{
		case 1:
			Ss = "Faint signals, barely perceptible";
			break;
		case 2:
			Ss = "Very weak signals";
			break;
		case 3:
			Ss = "Weak signals";
			break;
		case 4:
			Ss = "Fair signals";
			break;
		case 5:
			Ss = "Fairly good signals";
			break;
		case 6:
			Ss = "Good signals";
			break;
		case 7:
			Ss = "Moderately strong signals";
			break;
		case 8:
			Ss = "Strong signals";
			break;
		case 9:
			Ss = "Extremely strong signals";
			break;
		}
		System.out.println(Ss+", "+Rs+".");

	}

}
