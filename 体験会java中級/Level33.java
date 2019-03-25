package camp.trial02;

public class Level33 {

	public static void main(String[] args) {
		int count = 40;
		printFizzBuzz(count);
	}

	public static void printFizzBuzz(int count) {
		for(int i = 1; i <= count; i++) {
			System.out.print(i);    //数字
			if(i % 3 == 0) System.out.print("Fizz");      //Fizz表示
			if(i % 5 == 0) System.out.print("Buzz");      //Buzz表示
			System.out.println();
		}
	}

}
