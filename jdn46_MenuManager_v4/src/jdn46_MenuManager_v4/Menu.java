package jdn46_MenuManager_v4;

/**
 *Class Menu
 *author Joseph Nguyen
 *Created: 10/14/2022
 */
public class Menu {
	private Entree entree;
	private Side side;
	private Salad salad;
	private Dessert dessert;
	private String name;

	// constructors
	public Menu(String name) {
		this.name = name;
		this.entree = null;
		this.side = null;
		this.salad = null;
		this.dessert = null;
	}

	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = null;
		this.dessert = null;
	}

	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}

	public int totalCalories() {
		int calories = 0;
		if (getEntree() != null) {
			calories += getEntree().getCalories();
		}
		if (getSide() != null) {
			calories += getSide().getCalories();
		}
		if (getSalad() != null) {
			calories += getSalad().getCalories();
		}
		if (getDessert() != null) {
			calories += getDessert().getCalories();
		}
		return calories;
	}
	
	public double totalPrice() {
		int price = 0;
		if (getEntree() != null) {
			price += getEntree().getPrice();
		}
		if (getSide() != null) {
			price += getSide().getPrice();
		}
		if (getSalad() != null) {
			price += getSalad().getPrice();
		}
		if (getDessert() != null) {
			price += getDessert().getPrice();
		}
		return price;
	}

	public String description() {
		StringBuilder sb = new StringBuilder();
		sb.append("Entree: ");
		if (getEntree() != null) {
			sb.append(getEntree().getDescription());
		} else {
			sb.append("N/A");
		}
		sb.append("\n");
		sb.append("Side: ");
		if (getSide() != null) {
			sb.append(getSide().getDescription());
		} else {
			sb.append("N/A");
		}
		sb.append("\n");
		sb.append("Salad: ");
		if (getSalad() != null) {
			sb.append(getSalad().getDescription());
		} else {
			sb.append("N/A");
		}
		sb.append("\n");
		sb.append("Dessert: ");
		if (getDessert() != null) {
			sb.append(getDessert().getDescription());
		} else {
			sb.append("N/A");
		}
		return sb.toString();
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
	    return this.name;
	}

}