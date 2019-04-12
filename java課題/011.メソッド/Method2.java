package org.camp.servlet;

public class Method2 {
	static void judge(int a) {
		if(a % 2 == 0) System.out.println(a + "は偶数です");
		else System.out.println(a + "は奇数です");
	}

	public static void main(String[] args) {
		int a = 333;
		judge(a);
	}

}