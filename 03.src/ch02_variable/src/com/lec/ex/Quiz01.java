package com.lec.ex;

import java.util.Scanner;
//3�� ��� ���� �Ǵ��ϱ� : ����ڷκ��� ���ڸ� �Է� �ް�, �Է� ���� ���ڰ� 3�� ������� �ľ�
public class Quiz01 {
	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(i%3==0 ? "3�� ����Դϴ�." : "3�� ����� �ƴմϴ�.");
		
		
		
	}
}