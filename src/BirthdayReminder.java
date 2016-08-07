 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 21th";
		String dadsBirthday = "June 9th";
		String myBirthday = "Septemeber 1st";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String choice = JOptionPane.showInputDialog("Whos birthday do you want. (MOM DAD OR MY)");
	
		// 3. Print out what the user typed
		System.out.println(choice);
		
		// 4. if user asked for "mom"
		if (choice.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		else if (choice.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
			
		}
		else if (choice.equalsIgnoreCase("my")) {
			System.out.println(myBirthday);
		}
		else {
			System.out.println("Invalid Char Sequence: Please use, MOM, DAD or MY");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
