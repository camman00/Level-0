import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;
import javax.swing.JOptionPane;

public class CodingExercise1 {
	public static void main(String[] args) {
		String req = JOptionPane.showInputDialog(null, "Which color do you want? (red, blue or green)");
		Robot bot = new Robot();
		if (req.equalsIgnoreCase("red")) {
			bot.setPenColor(Color.RED);
		}
		else if (req.equalsIgnoreCase("blue")) {
			bot.setPenColor(Color.BLUE);
		}
		else {
			bot.setPenColor(Color.GREEN);
		}
		bot.setPenWidth(10);
		bot.penDown();
		for (int i = 0; i < 4; i++) {
			bot.move(200);
			bot.turn(90);
		}
	}
	
}
