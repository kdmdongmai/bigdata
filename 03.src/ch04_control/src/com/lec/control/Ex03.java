package com.lec.control;
//����ڷκ��� ����, ����, ���� ������ �Է¹޾� �� ���� ������ ��� �̻����� �������� ����� ����.
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
						
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ������ �Է� �ϼ��� : ");
		int kor = scanner.nextInt();
		System.out.println("���� ������ �Է� �ϼ��� : ");
		int eng = scanner.nextInt();
		System.out.println("���� ������ �Է� �ϼ��� : ");
		int mat = scanner.nextInt();
		double avg = (kor+eng+mat)/3.;
		
		if(kor>=avg) {
			System.out.println("����� ���� ������ ��� �̻��Դϴ�.");
		}else {
			System.out.println("����� ���� ������ ��� �̸��Դϴ�.");
		}
		if(eng>=avg) {
			System.out.println("����� ���� ������ ��� �̻��Դϴ�.");
		}else {
			System.out.println("����� ���� ������ ��� �̸��Դϴ�.");
		}
		if(mat>=avg) {
			System.out.println("����� ���� ������ ��� �̻��Դϴ�.");
		}else {
			System.out.println("����� ���� ������ ��� �̸��Դϴ�.");
		}
		scanner.close();
		
		
	}//main
}//class
