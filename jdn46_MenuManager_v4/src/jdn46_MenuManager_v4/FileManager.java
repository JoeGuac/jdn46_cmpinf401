package jdn46_MenuManager_v4;
/**
 * Class FileManager
 *author Joseph Nguyen
 *Created: 11/4/2022
 */

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FileManager {
	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = reader.readLine();
			while (line != null) {
				String[] fields = line.split("@@");
				String type = fields[1];
				MenuItem item;
				if (type.equals("entree")) {
					item = new Entree(fields[0], fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4]));
				} else if (type.equals("side")) {
					item = new Side(fields[0], fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4]));
				} else if (type.equals("salad")) {
					item = new Salad(fields[0], fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4]));
				} else if (type.equals("dessert")) {
					item = new Dessert(fields[0], fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4]));
				} else {
					continue;
				}
				menuItems.add(item);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return menuItems;
	}


	/**
	 * Method writeMenu
	 * @param string fileName
	 * @param ArrayList
	 * @return writing to a file of the name, description, calories, and price
	 */

	public static void writeMenus(String fileName, ArrayList<MenuItem> menus) {
		try {
			BufferedWriter writer = new BufferedWriter( new FileWriter( fileName ) );

			for ( MenuItem menu : menus ) {
				writer.write( menu.getName() );
				writer.newLine();

				writer.write( menu.getDescription() );
				writer.newLine();

				writer.write( menu.getCalories() );
				writer.newLine();

				writer.write( Double.toString( menu.getPrice() ) );
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}