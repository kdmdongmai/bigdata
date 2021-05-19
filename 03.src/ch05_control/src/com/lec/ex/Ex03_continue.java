package com.lec.ex;

public class Ex03_continue {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++) {
			if(i==3) continue; //3을 만나면 아래로 내려가지 말고 위로 올라가라
			System.out.print(i); 
		}
	}
	
	
}
