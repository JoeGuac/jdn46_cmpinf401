package lab2;

import javax.swing.JOptionPane;

public class ProblemII {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Input Radius");
		
		int r = Integer.parseInt(userInput);

		double perimeter = ((double) Math.round((Math.PI * (r * 2))*100))/100;
		
		double area = ((double) Math.round(Math.PI * (Math.pow(r, 2))*100))/100;
		
		System.out.println("The circle with radius " + r + "has an area of "+area+" and a perimeter of "+perimeter);
		
	}

}
