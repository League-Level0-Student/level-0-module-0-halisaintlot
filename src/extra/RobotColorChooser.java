package extra;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot bob = new Robot();
		
		String name = JOptionPane.showInputDialog("Enter a color.");
		if (name.toLowerCase().equals("yellow")) {
			bob.setPenColor(Color.yellow );
		}
		if (name.toLowerCase().equals("blue")) {
			bob.setPenColor(Color.blue );
		}
		if (name.toLowerCase().equals("red")) {
			bob.setPenColor(Color.red );
		}
		bob.penDown();
		bob.setSpeed(100);
		for (int i = 0; i < 4; i++) {

			// 2. Move your robot 200 pixels
			bob.move(200);

			// 4. Turn the robot 90 degrees to the right (90 degrees)
			bob.turn(90);

		}
	}
}