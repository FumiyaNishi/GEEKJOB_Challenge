package org.camp.servlet;

public class Class1 {
	private String name;
	private int age;
	private String address;

	public void setProfile(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void printProfile() {
		System.out.println("名前: " + this.name);
		System.out.println("年齢: " + this.age);
		System.out.println("住所: " + this.address);
	}

}