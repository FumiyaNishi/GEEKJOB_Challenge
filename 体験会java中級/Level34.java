
package camp.trial02;

public class Level34 {

	public static void main(String[] args) {
		int height = 5;
		int width = 8;
		createSquare(height, width);
	}

	public static void createSquare(int height, int width) {
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print("□");
			}
			System.out.println();
		}
	}

}
