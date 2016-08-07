import javax.swing.JOptionPane;
public class Riddle {
	public static void main(String[] args) {
		String riddle = JOptionPane.showInputDialog("How do crazy people go through the forest? Hint: They take the _____ ____");
		if (riddle.equalsIgnoreCase("Physco path")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}	
	}
}