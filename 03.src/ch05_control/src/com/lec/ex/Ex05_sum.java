package com.lec.ex;

public class Ex05_sum {
	public static void main(String args) {
		System.out.println("2¿¡¼­ 10");
		int sum = 0;
		for(int i = 0; i<=10 ; i++) {
			if(i%2==0) {
				sum +=i;
			}//if
			System.out.println(sum);
		}//for
		System.out.println(sum);
		
	}//main
}//class
