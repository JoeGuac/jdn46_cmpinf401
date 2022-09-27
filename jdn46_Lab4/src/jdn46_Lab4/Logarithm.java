package jdn46_Lab4;

import javax.swing.JOptionPane;

public class Logarithm {

	public static void main(String[] args) {
		String userInput1 = JOptionPane.showInputDialog("Value to Calculate Logarithm");
		String userInput2 = JOptionPane.showInputDialog("Base of Logarithm");
 		
		int value = Integer.parseInt(userInput1);
		int baseNum = Integer.parseInt(userInput2);
		
		while(value < 1 && baseNum < 2){		
			userInput1 = JOptionPane.showInputDialog("Value to Calculate Logarithm");
			userInput2 = JOptionPane.showInputDialog("Base of Logarithm");
			value = Integer.parseInt(userInput1);
			baseNum = Integer.parseInt(userInput2);
		}
		
		int i = 0;
		
		while(value>1) {
			value=value/baseNum;
			i++;
		}
		i=i+value-1;
		System.out.println("It takes " + i +" divisions for our quotient to be less than the base ("+baseNum+"), so the answer is "+ i);
		}
	}
