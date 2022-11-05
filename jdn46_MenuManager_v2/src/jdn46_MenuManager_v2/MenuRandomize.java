package jdn46_MenuManager_v2;
/**
 * Class MenuRandomize
 *author Joseph Nguyen
 *Created: 11/4/2022
 */
import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	private ArrayList<Entree> entree;
	private ArrayList<Side> side;
	private ArrayList<Salad> salad;
	private ArrayList<Dessert> dessert;

	public MenuRandomize (String entreeFile, String sideFile, String saladFile, String dessertFile) {
		entree =  FileManager.readEntree(entreeFile);
		side = FileManager.readSide(sideFile);
		salad = FileManager.readSalad(saladFile);
		dessert = FileManager.readDessert(dessertFile);
		
			
	}

	public Menu randomMenu() {
		int randEntree = new Random().nextInt(5);
		int randSide= new Random().nextInt(5);
		int randSalad = new Random().nextInt(5);
		int randDessert = new Random().nextInt(5);
		
		Menu menu = new Menu("Menu", entree.get(randEntree), side.get(randSide), salad.get(randSalad), dessert.get(randDessert));
		
		return menu;
	}
}
