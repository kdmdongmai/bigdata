package com.lec.ex;
//�� ���� �Է¹޾� �� ���� ������ ����� o�� x�� ���.
//ù ��° ���� �� ū�� ����� o�� x�� ���.
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		
		System.out.println("ù��° ���� �Է��ϼ���.");
		Scanner scanner1 = new Scanner(System.in);
		int n1 = scanner1.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���.");
		Scanner scanner2 = new Scanner(System.in);
		int n2 = scanner2.nextInt();
		if(n1==n2) {
			System.out.println("�� ���� ��������? O");
		} else {
			System.out.println("�� ���� ��������? X");
		}
		System.out.println(n1==n2 ? "�� ���� ��������? O" : "�� ���� ��������? X");
	}
}
