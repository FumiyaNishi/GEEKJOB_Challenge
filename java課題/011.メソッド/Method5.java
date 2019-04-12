package org.camp.servlet;

public class Method5 {
	static String[] userProfile() {
		String[] profile = {"1", "技育太郎", "東京", "男", "プログラマー"};
		return profile;
	}

	public static void main(String[] args) {
		String[] profile = userProfile();
		for(int i = 1; i < profile.length; i++) {
			System.out.println(profile[i]);
		}
	}

}