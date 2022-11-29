package jdn46_MenuManager_v3;
import java.util.ArrayList;

public class MenuTester{
	public static void main(String[] args){
		MenuManager randomize = new MenuManager("src/jdn46_MenuManager_v/dishes.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+ myMenu.totalCalories());
	}
}
