package lab2;

import javax.swing.JOptionPane;

public class ProblemIII {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Input Amount of Money");
		
		int userInputInt = Integer.parseInt(userInput);
		
		int grands = userInputInt/1000;
		
		int benjamins = (userInputInt%1000)/100;
		
		int sawbucks = (userInputInt%100)/10;
		
		int bucks = userInputInt%10;
		
		System.out.println(grands+" grands, "+benjamins+" benjamins, "+sawbucks+" sawbucks, "+bucks+" bucks");

	}

}
