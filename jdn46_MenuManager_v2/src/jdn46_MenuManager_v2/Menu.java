package jdn46_MenuManager_v2;
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
		entree = null;
		side = null;
		salad = null;
		dessert = null;
	}

	public Menu(String nameIn, Entree entree, Side side) {
		name = nameIn;
		this.entree = entree;
		this.side = side;
		salad = null;
		dessert = null;
	}

	public Menu(String nameIn, Entree entree, Side side, Salad salad, Dessert dessert) {
		name = nameIn;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
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

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public String description() {
		if (entree == null) {
			entree.setCal(0);
			entree.setDescription("N/A");
			entree.setName("N/A");
		}else{
			entree.getCal();
			entree.getDescription();
			entree.getName();
		}
		if (side == null) {
			side.setCal(0);
			side.setDescription("N/A");
			side.setName("N/A");
		}else{
			side.getCal();
			side.getDescription();
			side.getName();
		}
		if (salad == null) {
			salad.setCal(0);
			salad.setDescription("N/A");
			salad.setName("N/A");
		}else{
			salad.getCal();
			salad.getDescription();
			salad.getName();
		}
		
		if (dessert == null) {
			dessert.setCal(0);
			dessert.setDescription("N/A");
			dessert.setName("N/A");
		}else{
			dessert.getCal();
			dessert.getDescription();
			dessert.getName();
		}

		return "Entree: " + entree.getName() + ". " + entree.getDescription() + ". \n"+ "\n"
		+ "Side: " + side.getName() + ". " + side.getDescription() + ". \n"+ "\n"
		+ "Salad: " + salad.getName() + ". " + salad.getDescription() + ". \n" + "\n"
		+ "Dessert: " + dessert.getName() + ". " + dessert.getDescription() + ". \n";
	}
}