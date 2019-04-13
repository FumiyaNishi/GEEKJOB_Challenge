package org.camp.servlet;

public class challenge1506 {

	public static void main(String[] args) {
	    String mail = "camp-geekjob@groove-gear.jp";
	    int atIndex = mail.indexOf('@'); //@が何番目か(0からstart)
	    System.out.print(mail.substring(atIndex + 1)); //@の次の文字から表示
	}

}