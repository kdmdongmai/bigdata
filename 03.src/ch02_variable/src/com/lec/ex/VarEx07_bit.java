package com.lec.ex;

public class VarEx07_bit {
	public static void main(String[] args) {
		System.out.println("=====비트연산자=====");
		int n1 = 10;
		int n2 = 5;
		// n1 = 0 1 0 1 0
		// n2 = 0 0 1 0 1
		int result = n1 & n2;
		System.out.println(result);
		
		result = n1 | n2;
		System.out.println(result);
		
		result = n1 ^ n2;
		System.out.println(result);
	}
}
