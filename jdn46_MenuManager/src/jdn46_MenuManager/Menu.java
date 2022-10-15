package jdn46_MenuManager;
/**
 *Class Menu
 *author Joseph Nguyen
 *Created: 10/14/2022
 */
public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Dessert dessert;
	private Side side;


	public Menu(String nameIn) {
		name = nameIn;
		this.entree=null;
		this.side= null;
		this.dessert = null;
		this.salad = null;
	}

	public Menu(String nameIn, Entree entree, Side side) {
		name=nameIn;
		this.entree=entree;
		this.side=side;
		this.dessert = null;
		this.salad = null;
	}

	public Menu(String nameIn, Entree entree, Side side, Salad salad, Dessert dessert) {
		name = nameIn;
		this.entree=entree;
		this.side=side;
		this.salad=salad;
		this.dessert=dessert;
	}

	public int totalCalories(){
		return entree.getCal() + side.getCal() + dessert.getCal() + salad.getCal();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String description() {
		if(salad==null) {
			salad.setName("N/A");
			salad.setDescription("N/A");
			salad.setCal(0);
		}
		if(entree==null) {
			entree.setName("N/A");
			entree.setDescription("N/A");
			entree.setCal(0);
		}
		if(dessert==null) {
			dessert.setName("N/A");
			dessert.setDescription("N/A");
			dessert.setCal(0);
		}
		if(side==null) {
			side.setName("N/A");
			side.setDescription("N/A");
			side.setCal(0);
		}

		return "Entree: " + entree.getName() + ". " + entree.getDescription() + ". \n"+ "\n"
		+ "Side: " + side.getName() + ". " + side.getDescription() + ". \n"+ "\n"
		+ "Salad: " + salad.getName() + ". " + salad.getDescription() + ". \n" + "\n"
		+ "Dessert: " + dessert.getName() + ". " + dessert.getDescription() + ". \n";
	}
}