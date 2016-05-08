
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		String FN = JOptionPane.showInputDialog("What is your First Name?");
		String LN = JOptionPane.showInputDialog("What is your Last Name?");
		String BD = JOptionPane.showInputDialog("When is your Birthday?");
		String MF = JOptionPane.showInputDialog("What is your Gender (M/F)?");
		String D = JOptionPane.showInputDialog("Where are you traveling to?");
		JOptionPane.showMessageDialog(null, LN + "/ " + FN + "(" + BD + "," + MF + ")" + "/n" +  "Traveling to: " + D);
	}
}



