package com.lec.control;

import java.util.Scanner;

//Ű����κ��� ������ �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ� (if��, switch��)
public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է� �ϼ���.");
		int score = scanner.nextInt();
		int temp = (score==100)? score-1 : score;
		temp = (temp>=-9 && temp<=-1)? temp-10 : temp;
		int grade = temp/10;
		
		switch(grade) {
		case 9:
			System.out.println("����� ������ " +score+ "������ A���� �Դϴ�.");break;
		case 8:
			System.out.println("����� ������ " +score+ "������ B���� �Դϴ�.");break;
		case 7:
			System.out.println("����� ������ " +score+ "������ C���� �Դϴ�.");break;
		case 6:
			System.out.println("����� ������ " +score+ "������ D���� �Դϴ�.");break;
		default :
			System.out.println("����� ������ " +score+ "������ F���� �Դϴ�.");break;
		}
		
		//if��
//		if (90<=score && score<=100) {
//			System.out.println("����� ������ " +score+ "������ A���� �Դϴ�." );
//		} else if (80<=score && score<=89) {
//			System.out.println("����� ������ " +score+ "������ B���� �Դϴ�.");
//		} else if (70<=score && score<=79) {
//			System.out.println("����� ������ " +score+ "������ C���� �Դϴ�.");
//		} else if (60<=score && score<=69) {
//			System.out.println("����� ������ " +score+ "������ D���� �Դϴ�.");
//		} else {
//			System.out.println("����� F���� �Դϴ�.");
//		}
	}
}
