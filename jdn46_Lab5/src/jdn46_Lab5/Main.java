package jdn46_Lab5;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		RollDice dice;
		dice = new RollDice();
	
		String userInput = JOptionPane.showInputDialog("How many rolls would you like?");
		int times = Integer.parseInt(userInput);
		
		dice.RollDice(times);
		dice.RolledDice();
		
        System.out.println("2 was rolled " + dice.val2() + " times, with a probability of " + dice.prob2());
        System.out.println("3 was rolled " + dice.val3() + " times, with a probability of " + dice.prob3());
        System.out.println("4 was rolled " + dice.val4() + " times, with a probability of " + dice.prob4());
        System.out.println("5 was rolled " + dice.val5() + " times, with a probability of " + dice.prob5());
        System.out.println("6 was rolled " + dice.val6() + " times, with a probability of " + dice.prob6());
        System.out.println("7 was rolled " + dice.val7() + " times, with a probability of " + dice.prob7());
        System.out.println("8 was rolled " + dice.val8() + " times, with a probability of " + dice.prob8());
        System.out.println("9 was rolled " + dice.val9() + " times, with a probability of " + dice.prob9());
        System.out.println("10 was rolled " + dice.val10() + " times, with a probability of " + dice.prob10());
        System.out.println("11 was rolled " + dice.val11() + " times, with a probability of " + dice.prob11());
        System.out.println("12 was rolled " + dice.val12() + " times, with a probability of " + dice.prob12());
		
		System.out.println(times);
	}
}
