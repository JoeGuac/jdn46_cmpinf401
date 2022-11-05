package jdn46_MenuManager_v2;
/**
 * Class FileManager
 *author Joseph Nguyen
 *Created: 11/4/2022
 */
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileManager {
	
	
	public static ArrayList<Entree> readEntree(String fileName){
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
	}


}