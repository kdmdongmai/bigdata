package com.lec.ex;
//�Է��� ���� ¦������ Ȧ������ ���
import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n%2==0) {
			System.out.println("�Է��Ͻ� ���� ¦���Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ���� Ȧ���Դϴ�.");
		}
		
		System.out.println(n%2==0 ? "�Է��Ͻ� ���� ¦���Դϴ�." : "�Է��Ͻ� ���� Ȧ���Դϴ�.");
		
	}
}