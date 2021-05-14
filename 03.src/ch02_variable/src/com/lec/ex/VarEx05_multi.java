package com.lec.ex;

public class VarEx05_multi {
	public static void main(String[] args) {
		int h = 100;
		//삼항연산자
		//조건식의 결과에 따라 값/식을 분기하는 연산자
		//형식->
		System.out.println("=====삼항연산자=====");
		String result = (h%2==0 ? "짝수" : "홀수");
		System.out.println("삼항연산자 결과 h는 " + result);
		
	}
}
