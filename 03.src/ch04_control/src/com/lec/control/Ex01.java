package com.lec.control;
//수를 입력받아 절대값을 출력하라
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		System.out.println("수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int su = scanner.nextInt();
		if(su>=0) {
			System.out.println("입력하신 수의 절대값은 " + su + "입니다.");
		}else if(su<=0){
			System.out.println("입력하신 수의 절대값은 " + -su + "입니다.");
		}
	}
}
