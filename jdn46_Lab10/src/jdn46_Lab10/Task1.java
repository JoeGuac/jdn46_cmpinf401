package jdn46_Lab10;

public class Task1 {

	public static void main(String[] args) {
		System.out.print(sumOfDigits(234));
	}

	public static int sumOfDigits(int x) {
		int total = 0;
		x = Math.abs(x);
		if (x == 0) {
			return total;
		}else{
			total += x % 10;
			return total + (sumOfDigits(x /= 10));
		}
	} 
}