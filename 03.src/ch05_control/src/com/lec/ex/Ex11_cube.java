package com.lec.ex;

public class Ex11_cube {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		for(i=1 ; i<=6 ; i++) {
			for(j=1 ; j<=6 ; j++) {
				if(i+j==6) {
					System.out.print(i + " + " + j + " = " + (i+j) + "      ");
				}//if
			}//for -j
		}//for -i
	}//main
}//class
