package jdn46_MenuManager;
/**
 *Class Dessert
 *author Joseph Nguyen
 *Created: 10/13/2022
 */
public class Dessert {
	private String name;
	private String description;
	private int calories=0;

	public Dessert(String nameIn, String desc, int cal) {
		setName(nameIn);
		setDescription(desc);
		calories=cal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCal(){
		return calories;
	}

	public void setCal(int calories) {
		this.calories = calories;
	}

}