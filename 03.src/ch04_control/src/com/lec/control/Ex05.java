package com.lec.control;

import java.util.Scanner;

//키보드로부터 점수를 입력받아 학점을 출력하는 프로그램을 작성 (if문, switch문)
public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력 하세요.");
		int score = scanner.nextInt();
		int temp = (score==100)? score-1 : score;
		temp = (temp>=-9 && temp<=-1)? temp-10 : temp;
		int grade = temp/10;
		
		switch(grade) {
		case 9:
			System.out.println("당신의 점수는 " +score+ "점으로 A학점 입니다.");break;
		case 8:
			System.out.println("당신의 점수는 " +score+ "점으로 B학점 입니다.");break;
		case 7:
			System.out.println("당신의 점수는 " +score+ "점으로 C학점 입니다.");break;
		case 6:
			System.out.println("당신의 점수는 " +score+ "점으로 D학점 입니다.");break;
		default :
			System.out.println("당신의 점수는 " +score+ "점으로 F학점 입니다.");break;
		}
		
		//if문
//		if (90<=score && score<=100) {
//			System.out.println("당신의 점수는 " +score+ "점으로 A학점 입니다." );
//		} else if (80<=score && score<=89) {
//			System.out.println("당신의 점수는 " +score+ "점으로 B학점 입니다.");
//		} else if (70<=score && score<=79) {
//			System.out.println("당신의 점수는 " +score+ "점으로 C학점 입니다.");
//		} else if (60<=score && score<=69) {
//			System.out.println("당신의 점수는 " +score+ "점으로 D학점 입니다.");
//		} else {
//			System.out.println("당신은 F학점 입니다.");
//		}
	}
}
