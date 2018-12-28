package hello;

import java.util.Scanner;

public class trans {
	public static void main(String[] args) {
		int foot;
		double inch;
		System.out.println(1.2-1.1);
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextDouble();
		System.out.println(10/3);
		System.out.println(10.0/3);
		System.out.println("foot="+foot+", inch="+inch);
		System.out.println((int)((foot+inch/12)*0.3048*100));
	}

}
