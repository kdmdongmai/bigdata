package com.lec.control;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주사위 번호를 입력 하세요");
		int number = scanner.nextInt();
		
		if(number==1) {
			System.out.println("주사위는 1번");
		} else if(number==2) {
			System.out.println("주사위는 2번");
		} else if(number==3) {
			System.out.println("주사위는 3번");
		} else {
			System.out.println("주사위는 4번");
		}
		switch(number) {
		case 5:
			System.out.println("주사위는 1번");break;
		case 6:
			System.out.println("주사위는 2번");break;
		case 8:
			System.out.println("주사위는 3번");break;
		default :
			System.out.println("주사위는 4번");break;
			
		}
		
	}
}
