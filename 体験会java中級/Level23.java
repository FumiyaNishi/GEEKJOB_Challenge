package camp.trial02;

public class Level23 {

	public static void main(String[] args) {
		/*
		 * int型の変数moneyに好きな金額を入れてください。
		 *
		 * また、以下の条件分岐を作成して下さい。
		 * moneyの値が150以上のとき「ペットボトルを買いました」
		 * moneyの値が150未満かつ120以上のとき「缶を買いました」
		 * それ以外のときは「何も買えませんでした」
		 * と表示されるようにしてください。
		 *
		 * また、購入時にmoneyの残金と、購入したものがまだどれくらい購入できるかを表示しましょう。
		 *
		 */
		int money = 1000;

		if(money >= 150) {
			System.out.println("ペットボトルを買いました!");
			money -= 150;
			System.out.println("残金：" + money + "円");
			System.out.println("ペットボトルはあと" + money/150 + "つまで購入できます。");
		} else if(money >=120) {
			System.out.println("缶を買いました!");
			money -= 120;
			System.out.println("残金：" + money + "円");
			System.out.println("缶はあと" + money/120 + "つまで購入できます。");
		} else {
			System.out.println("何も買えませんでした");
		}

	}

}
