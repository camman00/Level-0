
public class Beer {
	public static void main(String[] args) {
		String part1;
		String part3 = "You take one down and pass it around,";
		for (int i = 99; i > 0; i--) {
			if (i > 1) {
				for (int j = 0; j < 3; j++) {
					if (j == 0) {
						part1 = i + " bottles of beer on the wall";
					}
					else if (j == 1) {
						part1 = i + " bottles of beer";
					}
					else {
						part1 = part3;
					}
					System.out.println(part1);
				}
			}
			
			if (i == 1) {
				//THESE ONES ARE FOR GRAMMAR CORRECTNESS - 4
				System.out.println("1 bottle of beer on the wall");
				System.out.println("1 bottle of beer");
				System.out.println("You take one down and pass it around,");
				System.out.println("now ya gotta uber home :P");
			}
			
		}
	}

}
