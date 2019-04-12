package org.camp.servlet;

public class Method3 {
	static void multiplication(int a, int b, boolean square) {

		if(square) System.out.println(Math.pow((a * b), 2));
		else System.out.println(a * b);
	}

	static void multiplication(boolean square) {
		int default1 = 2, default2 = 2;
		multiplication(default1, default2, square);
	}

	public static void main(String[] args) {
		int a = 3, b = 4;
		boolean square = true;
		multiplication(a, b, square);
		multiplication(square);
	}

}