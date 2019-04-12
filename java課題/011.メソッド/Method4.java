package org.camp.servlet;

public class Method4 {
	static int calculation() {
		int a = 15, b = 11;
		return a * b;
	}

	public static void main(String[] args) {
		int result = calculation();
		if(result >= 200) System.out.println("200以上です。");
		else if(result >= 100) System.out.println("100以上200未満です");
		else System.out.println("100未満です");
	}

}