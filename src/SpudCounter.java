import javax.swing.JOptionPane;

public class SpudCounter {
	public static void main(String[] args) {
		String Numbr = JOptionPane.showInputDialog("How many potatos do you want?");
		int Number = Integer.parseInt(Numbr);
		for (int x = 0; x < Number + 1; x++) {
			System.out.println(x + " potato");
		}
		System.out.println("More!!!");
	}

}
