package lab2;

import javax.swing.JOptionPane;

public class ProblemI {

	public static void main(String[] args) {
		String userInput1 = JOptionPane.showInputDialog("Please Enter First Number");
		
		int userInputInt1 = Integer.parseInt(userInput1);

		String userInput2 = JOptionPane.showInputDialog("Please Enter Second Number");
		
		int userInputInt2 = Integer.parseInt(userInput2);
		
		double r = (Math.sqrt(Math.pow(userInputInt1, 2) + Math.pow(userInputInt2, 2)))*100;
		
		double Hypo = ((double)Math.round(r))/100;
				
		System.out.println("The Hypotenuse is "+ Hypo);
	}

}
