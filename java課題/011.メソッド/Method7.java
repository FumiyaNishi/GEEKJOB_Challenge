package org.camp.servlet;

public class Method7 {
	static String[] userProfile(int id) {
		String[][] profiles = {
				{"1", "技育太郎", "東京", null, "プログラマー"},
				{"2", "技育花子", null, "女", "システムエンジニア"},
				{"3", "技育三郎", "大阪", "男", null}
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
			if(profile[i] == null) continue;
			System.out.println(profile[i]);
		}
	}

}