package org.camp.servlet;

public class Method8 {
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
		int idcount = 3;
		for(int i = 1; i <= idcount; i++) {
			String[] profile = userProfile(i);
			for(int j = 1; j < profile.length; j++) {
				System.out.print(profile[j] + " ");
			}
			System.out.println();
		}
	}

}