import java.util.Calendar;

import javax.swing.JOptionPane;
public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Hello, How old are you");
		Calendar current = Calendar.getInstance();
		int parsed = Integer.parseInt(age);
	    current.add(Calendar.YEAR,-parsed);
		int year = current.get(Calendar.YEAR);
		JOptionPane.showMessageDialog(null, "You were born in " + year);
		if (parsed > 30) {
			JOptionPane.showMessageDialog(null, "You are too old to play this game!");
		}
	}

}
