import javax.swing.JOptionPane;

public class ForLoopChallenges {
	public static void main(String[] args) {
		
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		Brake();
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		Brake();
		for (int i = 2; i < 101; i++) {
			System.out.println(i);
		}
		Brake();
		for (int i = 0; i < 100; i++) {
			if (!(i % 2 == 0)) {
				System.out.println(i);
			}
		}
		Brake();
		for (int i = 0; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println("EVEN: " + i);
			}
			else {
				System.out.println("ODD: " + i);
			}
			
		}
		Brake();
		for (int i = 0; i < 778; i += 7) {
			System.out.println(i);
		}
		Brake();
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		Brake();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
			}
			
		}
	}
	static void Brake() {
		JOptionPane.showMessageDialog(null, "Another one");
		
	}

}
