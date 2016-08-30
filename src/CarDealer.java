import java.util.Random;

import javax.swing.JOptionPane;

public class CarDealer {
	public static void main(String[] args) {
		//Make modle color year
		int Additonal;
		String Model = JOptionPane.showInputDialog("What car model and do you want (USE: Fancy, Cheap, Midsize,Truck)");
		String color = JOptionPane.showInputDialog("What color do you want it in?");
		String year = JOptionPane.showInputDialog("What year do you want it in?");
		String brand = JOptionPane.showInputDialog("Choose your brand (Ford,Porsch,Tesla,Chevy)");
		LiveResults();
		if (Model.equalsIgnoreCase("Fancy")) {
			Additonal = 10000;
			BrandCheck(Model, Additonal, Model, color, year, brand);
		}
		else if (Model.equalsIgnoreCase("Cheap")) {
			Additonal = 1000;
			BrandCheck(Model, Additonal, Model, color, year, brand);
		}
		else if (Model.equalsIgnoreCase("Midsize")) {
			Additonal = 5000;
			BrandCheck(Model, Additonal, Model, color, year, brand);
		}
		else {
			Additonal = 4000;
			BrandCheck(Model, Additonal, Model, color, year, brand);
		}
	}
	static void BrandCheck(String s,int z,String model,String color,String year,String brand) {
		Random rand = new Random();
		int Approx = rand.nextInt(200);
		int Combine = Approx + z;
		if (s.equalsIgnoreCase("Ford")) {
			JOptionPane.showMessageDialog(null, "Summary: " + "The car type is a " + s + " it will cost " + Combine + " the brand is " + brand + " and the color is " + color);
		}
		else if (s.equalsIgnoreCase("Porsch")) {
			JOptionPane.showMessageDialog(null, "Summary: " + "The car type is a " + s + " it will cost " + Combine + " the brand is " + brand + " and the color is " + color);
		}
		else if (s.equalsIgnoreCase("Tesla")) {
			JOptionPane.showMessageDialog(null, "Summary: " + "The car type is a " + s + " it will cost " + Combine + " the brand is " + brand + " and the color is " + color);
		}
		else {
			JOptionPane.showMessageDialog(null, "Summary: " + "The car type is a " + s + " it will cost " + Combine + " the brand is " + brand + " and the color is " + color);
		}
		
	}
	static void LiveResults() {
		JOptionPane.showMessageDialog(null, "Loading live results from carmax.com");
	}

}
