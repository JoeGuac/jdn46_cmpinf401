package jdn46_MenuManager_v2;
import java.util.ArrayList;

public class MenuTester{
	public static void main(String[] args){
		MenuRandomize randomize = new MenuRandomize("src/data/entrees.txt", "src/data/sides.txt","src/data/salads.txt","src/data/desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+ myMenu.totalCalories());
	}
}
