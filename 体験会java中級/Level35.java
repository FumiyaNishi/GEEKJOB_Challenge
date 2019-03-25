package camp.trial02;

public class Level35 {

	public static void main(String[] args) {
		//最終課題は1から全て自分で作ってみよう！
		int money = 5000;
		int drinkType = 2;
		int num = 9;
		vendingMachine(money, drinkType, num);
	}

	public static void vendingMachine(int money, int drinkType, int num) {
		int[] prices = {150, 120, 100};
		String[] names = {"コーラ", "お茶", "水"};
		int sum = prices[drinkType-1] * num;

		if(money > sum) {
			System.out.println("商品名：" + names[drinkType-1]);
			System.out.println("個数：" + num + "個");
			System.out.println("総額：" + sum + "円");
			System.out.println("残金：" + (money - sum) + "円");
		} else {
			System.out.println("料金が足りません");
		}
	}

}
