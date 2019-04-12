package org.camp.servlet;

public class Main2 {

	public static void main(String[] args) {
		Class2 person = new Class2();
		person.setProfile("西郁也", 22, "さいたま");
		person.printProfile();
		person.clearProfile();
		person.printProfile();
	}

}