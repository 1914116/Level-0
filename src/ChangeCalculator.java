
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have
		String Nickel=JOptionPane.showInputDialog("How many nickels do you have?");
		int n=Integer.parseInt(Nickel);
		n=n*5;
		String Dime =JOptionPane.showInputDialog("How many dimes do you have?");
		int d=Integer.parseInt(Dime);
		d=d*10;
		String Quarter =JOptionPane.showInputDialog("How many Quarters do you have?");
		int q=Integer.parseInt(Quarter);
		q=q*25;
		double total=(n + d + q);
		JOptionPane.showMessageDialog(null, "You Have " + total);
	}
}

