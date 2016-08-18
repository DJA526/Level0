public class StarPattern {

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
				if (j == i){
					System.out.println("");
				}
			}
		}
	}
}