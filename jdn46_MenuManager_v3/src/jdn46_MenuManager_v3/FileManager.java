package jdn46_MenuManager_v3;
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


	/*public static ArrayList<Entree> readEntree(String fileName){
		ArrayList<Entree> entrees = new ArrayList<Entree>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] namesEntree = line.split("@@");
				Entree entree = new Entree(namesEntree[0], namesEntree[1], Integer.parseInt(namesEntree[2]));
				entrees.add(entree);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return entrees;
	}

	public static ArrayList<Side> readSide(String fileName){
		ArrayList<Side> sides = new ArrayList<Side>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] namesSide = line.split("@@");
				Side side = new Side(namesSide[0], namesSide[1], Integer.parseInt(namesSide[2]));
				sides.add(side);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return sides;
	}

	public static ArrayList<Salad> readSalad(String fileName){
		ArrayList<Salad> salads = new ArrayList<Salad>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] namesSalad = line.split("@@");
				Salad salad = new Salad(namesSalad[0], namesSalad[1], Integer.parseInt(namesSalad[2]));
				salads.add(salad);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return salads;
	}

	public static ArrayList<Dessert> readDessert(String fileName){
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] namesDessert = line.split("@@");
				Dessert dessert = new Dessert(namesDessert[0], namesDessert[1], Integer.parseInt(namesDessert[2]));
				desserts.add(dessert);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return desserts;
	}*/

	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] nameMenuItem = line.split("@@");
				String typeDish = nameMenuItem[1];
				if(typeDish == "entree") {
					Entree menuItem = new Entree(nameMenuItem[0], nameMenuItem[2], Integer.parseInt(nameMenuItem[3]), Double.parseDouble(nameMenuItem[4]));
					menuItems.add(menuItem);
				}else if(typeDish == "side") {
					Side menuItem = new Side(nameMenuItem[0], nameMenuItem[2], Integer.parseInt(nameMenuItem[3]), Double.parseDouble(nameMenuItem[4]));
					menuItems.add(menuItem);
				}else if(typeDish == "salad") {
					Salad menuItem = new Salad(nameMenuItem[0], nameMenuItem[2], Integer.parseInt(nameMenuItem[3]), Double.parseDouble(nameMenuItem[4]));
					menuItems.add(menuItem);
				}else {
					Dessert menuItem = new Dessert(nameMenuItem[0], nameMenuItem[2], Integer.parseInt(nameMenuItem[3]), Double.parseDouble(nameMenuItem[4]));
					menuItems.add(menuItem);
				}
				br.close();
				fr.close();
			}

		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return menuItems;

	}

	/**
	* Method writeMenu
	* @param string fileName
	* @param ArrayList
	* @return writing to a file of the name, description, calories, and price
	*/

	public static void writeMenu(String fileName, ArrayList<MenuItem> menus) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < menus.size(); i++) {
                bw.write(menus.get(i).getName());
                bw.write(menus.get(i).getDescription());
                bw.write(menus.get(i).getCalories());
                bw.write(menus.get(i).getPrice());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
}
}