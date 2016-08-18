import javax.swing.JOptionPane;

public class ChangeCalculator {

	public static void main(String[] args) {
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int n = Integer.parseInt(nickels);
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int d = Integer.parseInt(dimes);
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int q = Integer.parseInt(quarters);
		double total = .05*n + .10*d + .25*q;
		JOptionPane.showMessageDialog(null, "You have $" + String.format("%.2f", total));
	}	
	
}