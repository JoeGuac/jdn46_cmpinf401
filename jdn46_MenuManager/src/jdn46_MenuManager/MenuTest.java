package jdn46_MenuManager;
/**
 *Class MenuTest
 *author Joseph Nguyen
 *Created: 10/14/2022
 */
public class MenuTest {

	public static void main(String[] args) {

		Entree Steak = new Entree("Steak", "Wagyu", 330);
		Entree Pasta = new Entree("Crab Alfredo", "A creamy white sauce, long strands of pasta mixed with pieces of crab", 200);
		Side Potatoes = new Side("Mashed Potatoes", "Potatoes that are mashed", 214);
		Side Fries = new Side("French Fries", "Thin cut French Fries with a sprinkle of salt", 100);
		Salad Caesar = new Salad("Caesar Salad", "Lettuce and Crutons with Caesar Dressing", 100);
		Dessert Pizookie = new Dessert("Pizookie", "Scoops of Ice Cream on top of a Cookie Dish", 1088);

		Menu menuTest1 =  new Menu("Menu 1", Steak, Potatoes);
		Menu menuTest2 = new Menu("Menu 2", Pasta, Fries, Caesar, Pizookie);

		//System.out.println(menuTest1.description());
		System.out.println(menuTest2.description());
		System.out.println("Total Calories: " + menuTest2.totalCalories());
	}
}