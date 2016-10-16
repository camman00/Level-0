import javax.swing.JOptionPane;

public class TresNumeros {
	public static void main(String[] args) {
		String numerouno = JOptionPane.showInputDialog("NUMERO UNOOOOOO");
		String numerodos = JOptionPane.showInputDialog("NUMERO DOS");
		String numerotres = JOptionPane.showInputDialog("NUMERO TRES");
		int one = Integer.parseInt(numerouno);
		int two = Integer.parseInt(numerodos);
		int three = Integer.parseInt(numerotres);
		if (one > two && one > three) {
			System.out.println(numerouno);
			if (two > three && two > one) {
				System.out.println(numerodos);
				System.out.println(numerotres);
			}
			else {
				System.out.println(numerotres);
				System.out.println(numerodos);
				
			}
		}
		
	}

}
