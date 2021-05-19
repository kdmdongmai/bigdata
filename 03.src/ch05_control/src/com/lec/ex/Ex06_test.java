package com.lec.ex;

import java.util.Scanner;

public class Ex06_test {
	public static void main(String[] args) {
		System.out.println("원하는 구구단의 수를 입력 하세요.");
		Scanner scanner = new Scanner(System.in);
		int su = scanner.nextInt();
		for(int i = 1 ; i<=9 ; i++) {
			System.out.printf("%d X %d = %d\t", su, i, su*i);
		}
		scanner.close();
	}
	
}
