import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, "
				+ "here's how to do it...");
		String adj = JOptionPane.showInputDialog("Enter an adjective.");
		String liquid = JOptionPane.showInputDialog("Enter a type of liquid.");
		String bodypart = JOptionPane.showInputDialog("Enter a body part.");
		String verb = JOptionPane.showInputDialog("Enter a verb.");
		String place = JOptionPane.showInputDialog("Enter a place.");
		String sentence = "Piranhas are more " + adj + " during the day, so cross the river at "
		+ "night.\n Piranhas are attracted to fresh " + liquid + " and will most "
		+ "likely take a bite out of your " + bodypart + " if you " + verb + ".\n Whatever "
		+ "you do, if you have an open wound, try to find another way to get "
		+ "back to the " + place + ". Good luck!";
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, sentence);
	}
}