package com.lec.control;
//사용자로부터 국어, 영어, 수학 점수를 입력받아 각 과목별 점수가 평균 이상인지 이하인지 출력해 보자.
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
						
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수를 입력 하세요 : ");
		int kor = scanner.nextInt();
		System.out.println("영어 점수를 입력 하세요 : ");
		int eng = scanner.nextInt();
		System.out.println("수학 점수를 입력 하세요 : ");
		int mat = scanner.nextInt();
		double avg = (kor+eng+mat)/3.;
		
		if(kor>=avg) {
			System.out.println("당신의 국어 점수는 평균 이상입니다.");
		}else {
			System.out.println("당신의 국어 점수는 평균 미만입니다.");
		}
		if(eng>=avg) {
			System.out.println("당신의 영어 점수는 평균 이상입니다.");
		}else {
			System.out.println("당신의 영어 점수는 평균 미만입니다.");
		}
		if(mat>=avg) {
			System.out.println("당신의 수학 점수는 평균 이상입니다.");
		}else {
			System.out.println("당신의 수학 점수는 평균 미만입니다.");
		}
		scanner.close();
		
		
	}//main
}//class
