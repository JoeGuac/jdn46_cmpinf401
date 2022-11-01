package jdn46_Lab7;

import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("How many numbers would you like?");
		int times = Integer.parseInt(userInput);

		double[] val = new double[times];
		System.out.println("Random number array...");
		for (int i = 0; i < val.length; i++) {
			val[i] = new Random().nextInt(100);
			System.out.println(val[i]);
		}
		
		System.out.println("Minimum = " + min(val));
		System.out.println("Maximum = " + max(val));
		System.out.println("Sum = " + sum(val));
		System.out.println("Average = " + ave(val));
	}
	
	public static double min(double [] data) {
		double min = Double.MAX_VALUE;
		for (double val : data) {
			if (val < min)
				min = val;
		}
		return min;
	}

	public static double max(double [] data) {
		double max = Double.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max)
				max = data[i];
		}
		return max;
	}

	public static double sum(double [] data){
		double sum = 0;  
		for (int i = 0; i < data.length; i++) {  
			sum += data[i];
		}
		return sum;
	}

	public static double ave (double [] data){
		double sum = 0;
		for (int i = 0; i < data.length; i++) {  
			sum += data[i];
		}
		return sum/data.length;
	}
}