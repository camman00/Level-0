import javax.swing.JOptionPane;

public class TresNumeros {
	public static void main(String[] args) {
		String numerouno = JOptionPane.showInputDialog("NUMERO UNOOOOOO");
		String numerodos = JOptionPane.showInputDialog("NUMERO DOS");
		String numerotres = JOptionPane.showInputDialog("NUMERO TRES");
		int one = Integer.parseInt(numerouno);
		int two = Integer.parseInt(numerodos);
		int three = Integer.parseInt(numerotres);
		for (int i = 0; i < args.length; i++) {
			if (one > two && one > three) {
				System.out.println(numerouno);
			}
			if (two > one && two > three) {
				System.out.println(numerodos);
			}
			if (three > one && three > two) {
				System.out.println(numerotres);
			}
		}
		
	}

}
