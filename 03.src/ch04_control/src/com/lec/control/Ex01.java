package com.lec.control;
//���� �Է¹޾� ���밪�� ����϶�
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int su = scanner.nextInt();
		if(su>=0) {
			System.out.println("�Է��Ͻ� ���� ���밪�� " + su + "�Դϴ�.");
		}else if(su<=0){
			System.out.println("�Է��Ͻ� ���� ���밪�� " + -su + "�Դϴ�.");
		}
	}
}
