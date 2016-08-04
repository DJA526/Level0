import java.util.Random;
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		//String spins = JOptionPane.showInputDialog("How dizzy do you want the tortoise from 1 to 10?");
		int s = new Random().nextInt(10);
		dance(s);
		System.out.println(s);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}