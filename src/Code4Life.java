import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			String coding = JOptionPane.showInputDialog("How many hours have you spent coding this week?");
			int code = Integer.parseInt(coding);
			if (code < 2) {
				JOptionPane.showMessageDialog(null, "Stop watching YouTube and write code instead!");
			} else if (code > 5) {
				playBatmanTheme();
			} else if (code >= 3) {
				JOptionPane.showMessageDialog(null, "You're a Code Ninja!");
			}
		}
	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}