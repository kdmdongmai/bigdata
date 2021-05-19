package com.lec.ex;

public class Ex07_while {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<=100) {
			if(i%10==0) {
				sum +=i;
			}
			i++;
		}
		System.out.println(sum);
	}//main
}//class
