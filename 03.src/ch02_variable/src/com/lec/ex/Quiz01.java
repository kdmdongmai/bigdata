package com.lec.ex;

import java.util.Scanner;
//3의 배수 숫자 판단하기 : 사용자로부터 숫자를 입력 받고, 입력 받은 숫자가 3의 배수인지 파악
public class Quiz01 {
	public static void main(String[] args) {
		System.out.println("수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(i%3==0 ? "3의 배수입니다." : "3의 배수가 아닙니다.");
		
		
		
	}
}
