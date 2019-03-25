package camp.trial02;

public class Level24 {

	public static void main(String[] args) {
		/*
		 * 1から100の数字の偶数の和を表示して下さい。
		 */
		int sum = 0;

		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

}
