package com.lec.ex;
//입력한 수가 짝수인지 홀수인지 출력
import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		System.out.println("수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n%2==0) {
			System.out.println("입력하신 수는 짝수입니다.");
		}else {
			System.out.println("입력하신 수는 홀수입니다.");
		}
		
		System.out.println(n%2==0 ? "입력하신 수는 짝수입니다." : "입력하신 수는 홀수입니다.");
		
	}
}
