package jdn46_MenuManager_v3;
/**
 *Class MenuItem
 *author Joseph Nguyen
 *Created: 11/28/2022
 */
public class MenuItem {
	private String name;
	private String description;
	private int calories;
	private double price;

	public MenuItem(String nameIn, String desc, int cal, double price) {
		setName(nameIn);
		setDescription(desc);
		setCalories(cal);
		this.setPrice(price);
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

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}