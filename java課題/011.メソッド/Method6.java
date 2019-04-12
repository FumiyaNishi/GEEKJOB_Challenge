package org.camp.servlet;

public class Method6 {
	static String[] userProfile(int id) {
		String[][] profiles = {
				{"1", "技育太郎", "東京", "男", "プログラマー"},
				{"2", "技育花子", "北海道", "女", "システムエンジニア"},
				{"3", "技育三郎", "大阪", "男", "Webエンジニア"}
		};

		for(String[] profile : profiles) {
			if(id == Integer.parseInt(profile[0])) return profile;
		}
		return null;
	}

	public static void main(String[] args) {
		int id = 2;
		String[] profile = userProfile(id);
		for(int i = 1; i < profile.length; i++) {
			System.out.println(profile[i]);
		}
	}

}