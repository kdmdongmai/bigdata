package com.lec.ex;
import java.util.Scanner;
public class Ex08_dowhile {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Ű���忡 ¦���� �Է��Ͻÿ�.");
			num = scanner.nextInt();
		} while(num%2!=0);
		System.out.printf("�Է��Ͻ� �� %d�� ¦���Դϴ�.", num);
		scanner.close();	
	}//main
}//main
