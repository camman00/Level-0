import java.util.Scanner;

public class Zork {
	public static void main(String[] args) {
		System.out.println("Please say 'yes' ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		if (s.equalsIgnoreCase("yes")) {
			System.out.println("NO!");
		}
		System.out.println("You have 4 apples you gain 1 what do you have now?");
		String s2 = scanner.nextLine();
		if (s2.contains("1")) {
			System.out.println("Smart guy! (:D)");
		}
		scanner.close();
	}

}
