package jdn46_MenuManager_v3;
/**
 * Class MenuManager
 * Author Joseph Nguyen
 * Created 11/28/2022
 */
import java.util.ArrayList;
import java.util.Random;

public class MenuManager {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	/**
	* Method menu manager
	* @param string dishesFile
	* @return catergorizing the dish type
	*/

	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> menu =  FileManager.readItems(dishesFile);
		
		for(int i=0; i < menu.size(); i++) {
			if(menu.get(i) instanceof Entree) {
				Entree num = new Enteree();
				entrees.add(menu.get(i));
			}
			else if(menu.get(i) instanceof Side) {
				sides.add(menu.get(i));
			}
			else if(menu.get(i) instanceof Salad) {
				salads.add(menu.get(i));
			}
			else if(menu.get(i) instanceof Dessert) {
				desserts.add(menu.get(i));
			}
			
		}
		
		
		
	}
	
	/**
	* Method randomMenu
	* @return random assortments of menu items
	*/

	public Menu randomMenu() {
		int randEntree = new Random().nextInt(5);
		int randSide= new Random().nextInt(5);
		int randSalad = new Random().nextInt(5);
		int randDessert = new Random().nextInt(5);
		
		Menu menu = new Menu("Menu", entrees.get(randEntree), sides.get(randSide), salads.get(randSalad), desserts.get(randDessert));
		
		return menu;
	}
}
