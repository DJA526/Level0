
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {

	public static void main(String[] args) {
		Tortoise.setPenWidth(8);
		Tortoise.setSpeed(10);
		for (int a = 0; a < 30; a++) {
			Tortoise.penUp();
			int x = new Random().nextInt(450) + 50;
			int y = new Random().nextInt(450) + 50;
			Tortoise.moveTo(x, y);
			String color = JOptionPane.showInputDialog("What color would you like the tortoise to draw?");
			if (color.equals("red")) {
				Tortoise.setPenColor(PenColors.Reds.Crimson);
			} else if (color.equals("orange")) {
				Tortoise.setPenColor(PenColors.Oranges.Coral);
			} else if (color.equals("yellow")) {
				Tortoise.setPenColor(PenColors.Yellows.Gold);
			} else if (color.equals("green")) {
				Tortoise.setPenColor(PenColors.Greens.Chartreuse);
			} else if (color.equals("blue")) {
				Tortoise.setPenColor(PenColors.Blues.Aqua);
			} else if (color.equals("purple")) {
				Tortoise.setPenColor(PenColors.Purples.BlueViolet);
			} else if (color.equals("")) {
				Tortoise.setPenColor(PenColors.getRandomColor());
			} else {
				JOptionPane.showMessageDialog(null, "Color not available.");
				Tortoise.setPenColor(PenColors.getRandomColor());
			}
			int l = new Random().nextInt(90) + 10;
			drawStar(l);
		}
	}

	private static void drawStar(int length) {
		for (int i = 0; i < 5; i++) {
			Tortoise.penDown();
			Tortoise.move(length);
			Tortoise.turn(144);
		}
	}

}