package com.lec.ex;
//두 수를 입력받아 두 수가 같은지 결과를 o나 x로 출력.
//첫 번째 수가 더 큰지 결과를 o나 x로 출력.
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		
		System.out.println("첫번째 수를 입력하세요.");
		Scanner scanner1 = new Scanner(System.in);
		int n1 = scanner1.nextInt();
		System.out.println("두번째 수를 입력하세요.");
		Scanner scanner2 = new Scanner(System.in);
		int n2 = scanner2.nextInt();
		if(n1==n2) {
			System.out.println("두 수가 같은가요? O");
		} else {
			System.out.println("두 수가 같은가요? X");
		}
		System.out.println(n1==n2 ? "두 수가 같은가요? O" : "두 수가 같은가요? X");
	}
}
