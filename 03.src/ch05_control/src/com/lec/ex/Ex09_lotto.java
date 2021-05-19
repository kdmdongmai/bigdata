package com.lec.ex;

import java.util.Scanner;

public class Ex09_lotto {
	public static void main(String[] args) {
		int su;
		int min = 1;
		int max = 45;
		int lotto;
		lotto = (int)(Math.random()*45)+1;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.printf("%d���� %d������ �ζ� ���ڸ� ���� ������.", min, max);
			su = scanner.nextInt();
			if(su<min || max<su) {
				System.out.println("������ Ʋ�Ⱦ��.");
			}else if(su>lotto) {
				max = su-1;
			} else if(su<lotto) {
				min = su+1;
			} else {
				System.out.printf("������ %d �Դϴ�.", lotto);
				break;
			}
		} while (true);
		scanner.close();
			
	}//main
}//class
