package com.lec.ex;

public class Quiz05 {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 80;
		int mat = 50;
		int sum = kor + eng + mat;
		double avg = sum/3;
		
		System.out.printf("���� : %d,  ���� : %d,  ���� : %d,  �հ� : %d,  ��� : %.2f", kor, eng, mat, sum, avg);
	}
}
