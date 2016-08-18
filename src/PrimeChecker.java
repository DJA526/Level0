import javax.swing.JOptionPane;

public class PrimeChecker {

	public static void main(String[] args) {
		for (int a = 0; ;a++) {
			String divisors = "";
			String number = JOptionPane.showInputDialog("Enter a number.");
			if (number.equals("")){
				break;
			}
			int num = Integer.parseInt(number);
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					divisors = divisors + i + ", ";
				}
			}
			if (divisors.equals("")){
				JOptionPane.showMessageDialog(null, num + " is a prime number.");
			} else {
				JOptionPane.showMessageDialog(null, num + " is a composite number. Its divisors are " + divisors);
			}
		}
	}
}