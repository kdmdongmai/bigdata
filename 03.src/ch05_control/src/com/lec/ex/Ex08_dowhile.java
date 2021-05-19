package com.lec.ex;
import java.util.Scanner;
public class Ex08_dowhile {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("키보드에 짝수를 입력하시오.");
			num = scanner.nextInt();
		} while(num%2!=0);
		System.out.printf("입력하신 수 %d는 짝수입니다.", num);
		scanner.close();	
	}//main
}//main
