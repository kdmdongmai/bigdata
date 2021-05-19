package com.lec.ex;

public class Ex10_sum {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
//		for(i=0 ; i<=20 ; i++) {
//			if(i%2==0 && i%3==0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//		while(i<=20) {
//			if(i%2==0 && i%3==0) {
//				sum += i;
//			}//if
//			i++;
//		}//while
//		System.out.println(sum);
		
		do {
			i++;
			if(i%2==0 && i%3==0) {
				sum+=i;
			}
			
		} while (i<=20);
		System.out.println(sum);
		
	}//main
}//class
