package hello;

import java.util.Scanner;

public class hello {
	
	public static void main(String[] args) {
		System.out.println("��ã�");
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
//		final int amount=100;
		int amount=100;
		int price=0;
		System.out.print("������Ʊ�棺");
		amount = in.nextInt();
		System.out.print("�������");
		price = in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
	}

}