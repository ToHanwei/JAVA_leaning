package hello;

import java.util.Scanner;

public class priority {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub
//		初始化
		Scanner in = new Scanner(System.in);
//		读入投币金额ss
		System.out.print("请投币：");
		int amount = in.nextInt();
//		打印车票
		System.out.println("*****************");
		System.out.println("*JAVA城际铁路专线*");
		System.out.println("* 无指定座位车票  *");
		System.out.println("*    票价10元       *");
		System.out.println("*****************");
//		计算并打印找零
		System.out.println("找零："+(amount-10));

	}

}
