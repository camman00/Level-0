import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String numbs = JOptionPane.showInputDialog("ENTER A NUUUUUUUUUUUUUUMBBBBBBBBBBBBBBBEEEEEEEEEEEEEEEEEEEEEERRRRRRRRRR!");
		int num = Integer.parseInt(numbs);
		PrimeOrNah(num);
	}
	private static void PrimeOrNah(int num) {
		for (int i = 2; i < 10; i++) {
			if (num > 1 && !(num % i == 0)) {
				System.out.println("Divisible by " + i + " = Not Divisible!");
			}
			else {
				System.out.println("Divisible by " + i + " = Divisible! Not prime!");
				i += 100;
			}
				
			
		}
		
	}

}
