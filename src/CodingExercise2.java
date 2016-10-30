import javax.swing.JOptionPane;
public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Hello, How old are you");
		int current = 2016;
		int parsed = Integer.parseInt(age);
		int year = current - parsed;
		JOptionPane.showMessageDialog(null, "You were born in " + year);
		if (parsed > 30) {
			JOptionPane.showMessageDialog(null, "You are too old to play this game!");
		}
	}

}
