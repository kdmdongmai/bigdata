package com.lec.control;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ֻ��� ��ȣ�� �Է� �ϼ���");
		int number = scanner.nextInt();
		
		if(number==1) {
			System.out.println("�ֻ����� 1��");
		} else if(number==2) {
			System.out.println("�ֻ����� 2��");
		} else if(number==3) {
			System.out.println("�ֻ����� 3��");
		} else {
			System.out.println("�ֻ����� 4��");
		}
		switch(number) {
		case 5:
			System.out.println("�ֻ����� 1��");break;
		case 6:
			System.out.println("�ֻ����� 2��");break;
		case 8:
			System.out.println("�ֻ����� 3��");break;
		default :
			System.out.println("�ֻ����� 4��");break;
			
		}
		
	}
}
