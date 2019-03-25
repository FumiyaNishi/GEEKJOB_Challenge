package camp.trial02;

public class Level29 {

	public static void main(String[] args) {
		/*
		 * 配列の要素の最大値と最低値を表示して下さい
		 */

		int[] points = {10,25,35,40,55};
		int max = 0;
		int min = points[0];

		for(int point : points) {
			if(point > max) max = point;
			if(point < min) min = point;
		}

		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);

	}

}
