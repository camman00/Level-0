import javax.swing.JOptionPane;
public class Age {
	public static void main(String[] args) {
		int Current = 2016 + 1;
		String age = JOptionPane.showInputDialog("Enter in your current age NOWWWWWWWWWWWWWWWWWW!");
		int ageint = Integer.valueOf(age);
		for (int i = 0; i < ageint; i++) {
			System.out.println((Current - ageint) + i);
		}
	}
}
