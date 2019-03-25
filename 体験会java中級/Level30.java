package camp.trial02;

public class Level30 {

	public static void main(String[] args) {
		/*
		 * 配列を基に、「GEEKJOB」と表示させて下さい
		 *
		 */
		String[] message = {"P","G",
                "R","E",
                "O","E",
                "G","K",
                "R","J",
                "A","O",
                "M","B"};
		String geekjob = "";

		for(int i=1; i<message.length; i+=2) {
			geekjob += message[i];
		}

		System.out.println(geekjob);
	}
}
