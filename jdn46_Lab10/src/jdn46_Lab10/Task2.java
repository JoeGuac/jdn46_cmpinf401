package jdn46_Lab10;

public class Task2 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		printArrayElements(array, 0);
	}

	public static void printArrayElements(int a[], int index) {
		if (index == a.length-1) {
			System.out.println(a[index]);
		}else{
			printArrayElements(a, index+1);
			System.out.println(a[index]);
		}
	}

}