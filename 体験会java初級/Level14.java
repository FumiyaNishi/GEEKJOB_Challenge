package camp.trial01;

public class Level14 {
	public static void main(String[] args) {
		/*
		 * 【課題14】
		 * 自動販売機のシステムプログラムです。
		 * int型の変数moneyに好きな金額を入れてください。
		 *
		 */
		int money = 130;    //好きな数に変更して下さい

	    /*
	        以下のifを作成して下さい
		moneyの値が150以上のとき「ペットボトルを買いました」
		moneyの値が150未満かつ120以上のとき「缶を買いました」
		それ以外のときは「何も買えませんでした」
		と表示されるようにしてください。

	    */
		//ここから
		if(money >= 150) {
			System.out.println(money);
			System.out.println("ペットボトルを買いました");
		} else if(money >= 120){
			System.out.println(money);
			System.out.println("缶を買いました");
		} else {
			System.out.println(money);
			System.out.println("何も買えませんでした");
		}


		//ここまで
	}
}
