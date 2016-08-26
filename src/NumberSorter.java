import javax.swing.JOptionPane;

public class NumberSorter {

	public static void main(String[] args) {
		String one = JOptionPane.showInputDialog("Enter an integer.");
		String two = JOptionPane.showInputDialog("Enter another integer.");
		String three = JOptionPane.showInputDialog("Enter another integer.");
		int x = Integer.parseInt(one);
		int y = Integer.parseInt(two);
		int z = Integer.parseInt(three);
		if (x < y && x < z) {
			System.out.println(x);
			compare(y, z);
		} else if (y < x && y < z) {
			System.out.println(y);
			compare(x, z);
		} else if (z < x && z < y) {
			System.out.println(z);
			compare(x, y);
		}
		
	}

	private static void compare(int y, int z) {
		if (y < z) {
			System.out.println(y);
			System.out.println(z);
		} else if (z < y) {
			System.out.println(z);
			System.out.println(y);
		}
	}
}
