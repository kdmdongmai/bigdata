package com.lec.control;
//두 수 중 큰 수를 변수 max에 입력하고 변수 max를 출력하는 프로그램
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		int max = 0;
		
		System.out.println("첫 번째 수를 입력하세요 : ");
		Scanner scanner1 = new Scanner(System.in);
		int num1 = scanner1.nextInt();
		System.out.println("두 번째 수를 입력하세요 : ");
		Scanner scanner2 = new Scanner(System.in);
		int num2 = scanner2.nextInt();
		
		//		if(num1>num2) {
//			System.out.println("최대값은 "+num1+ "입니다.");
//		}else if(num1<num2) {
//			System.out.println("최대값은 "+num2+ "입니다.");
//		}else if(num1==num2) {
//			System.out.println("최대값은 둘 다 입니다.");
//		}
	}
}
