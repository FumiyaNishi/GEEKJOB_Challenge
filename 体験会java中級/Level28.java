package camp.trial02;

public class Level28 {

	public static void main(String[] args) {
		/*
		 * 配列の要素全ての合計値と、その平均値を表示して下さい。
		 */

		int[] points = {10,25,35,40,55};
		int sum = 0;

		for(int point : points) {
			sum += point;
		}

			System.out.println("合計値：" + sum);
			System.out.println("平均値：" + sum/points.length);

	}

}
