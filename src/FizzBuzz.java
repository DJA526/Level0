import java.util.Random;

import javax.swing.JOptionPane;

public class FizzBuzz {

	public static void main(String[] args) {
		String sequence = "";
		int x = new Random().nextInt(10);
		int y = new Random().nextInt(10);
		for (int i = 1; i < 21; i++) {
			if (i % x == 0 && i % y == 0) {
				sequence += " fizzbuzz,";
			} else if (i % x == 0) {
				sequence += " fizz,";
			} else if (i % y == 0) {
				sequence += " buzz,";
			} else {
				sequence = sequence + " " + i + ",";
			}
		}
		JOptionPane.showMessageDialog(null, sequence);
	}

}