package com.lec.ex;

import java.util.Scanner;
public class Quiz04 {
	public static void main(String[] args) {
		System.out.println("���̸� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(age>=65) {
			System.out.println("��ο��");
		}else {
			System.out.println("�Ϲ�");
		}
		
		System.out.println(age>=65 ? "��ο��" : "�Ϲ�");
		
	}
}
