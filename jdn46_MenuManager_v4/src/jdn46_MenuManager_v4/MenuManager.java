package jdn46_MenuManager_v4;
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

	public MenuManager(String dishesFile) {
		entrees = new ArrayList<>();
		sides = new ArrayList<>();
		salads = new ArrayList<>();
		desserts = new ArrayList<>();

		FileManager fm = new FileManager();
		ArrayList<MenuItem> menuItems = fm.readItems(dishesFile);

		for (MenuItem item : menuItems) {
			if (item instanceof Entree) {
				entrees.add((Entree) item);
			} else if (item instanceof Side) {
				sides.add((Side) item);
			} else if (item instanceof Salad) {
				salads.add((Salad) item);
			} else if (item instanceof Dessert) {
				desserts.add((Dessert) item);
			}
		}
	}

	public Menu randomMenu(String name) {
		Random rand = new Random();

		int randEntree = rand.nextInt(entrees.size());
		int randSide = rand.nextInt(sides.size());
		int randSalad = rand.nextInt(salads.size());
		int randDessert = rand.nextInt(desserts.size());

		Menu randMenu = new Menu(name, entrees.get(randEntree), sides.get(randSide), salads.get(randSalad), desserts.get(randDessert));

		return randMenu;
	}


	public ArrayList<Entree> getEntrees() {
		return entrees;
	}


	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}


	public ArrayList<Side> getSides() {
		return sides;
	}


	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}


	public ArrayList<Salad> getSalads() {
		return salads;
	}


	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}


	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}


	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}


}
