package com.lec.ex;

public class Quiz05 {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 80;
		int mat = 50;
		int sum = kor + eng + mat;
		double avg = sum/3;
		
		System.out.printf("국어 : %d,  영어 : %d,  수학 : %d,  합계 : %d,  평균 : %.2f", kor, eng, mat, sum, avg);
	}
}
