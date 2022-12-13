package jdn46_MenuManager_v4;
/**
 * Class MenuManagerGUI
 *author Joseph Nguyen
 *Created: 12/10/2022
 */
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;


public class MenuManagerGUI {
	// Declare all components as properties of the class
	private JFrame mainFrame;
	private JLabel entreeLabel;
	private JLabel entreeLabel2;
	private JComboBox entreeComboBox;
	private JLabel sideLabel;
	private JLabel sideLabel2;
	private JComboBox sideComboBox;
	private JLabel saladLabel;
	private JLabel saladLabel2;
	private JComboBox saladComboBox;
	private JLabel dessertLabel;
	private JLabel dessertLabel2;
	private JComboBox dessertComboBox;
	private JButton generateMenuButton;
	private JButton randMenuButton;
	private JTextArea entreeInfo;
	private JTextArea sideInfo;
	private JTextArea saladInfo;
	private JTextArea dessertInfo;
	private JLabel calLabel;
	private JLabel priceLabel;
	private JTextArea totCals;
	private JTextArea totPrice;
	private JButton delete;
	private JButton save;
	private JButton details;
	private MenuManager menuManager;

	public MenuManagerGUI() {
		menuManager = new MenuManager("src/jdn46_MenuManager_v4/dishes.txt");
		mainFrame = new JFrame("Menu Manager");
		DefaultListModel<Menu> listModel = new DefaultListModel<>();
		JList<Menu> menuList = new JList<>(listModel);
		JScrollPane scrollPane = new JScrollPane(menuList);

		//Combo Boxes and Labels
		entreeComboBox = new JComboBox();
		entreeComboBox.setModel(new DefaultComboBoxModel(menuManager.getEntrees().toArray()));
		entreeComboBox.setSelectedIndex(0);

		entreeLabel = new JLabel("Entree:");

		sideComboBox = new JComboBox();
		sideComboBox.setModel(new DefaultComboBoxModel(menuManager.getSides().toArray()));
		sideComboBox.setSelectedIndex(0);

		sideLabel = new JLabel("Side:");

		saladComboBox = new JComboBox();
		saladComboBox.setModel(new DefaultComboBoxModel(menuManager.getSalads().toArray()));
		saladComboBox.setSelectedIndex(0);

		saladLabel = new JLabel("Salad:");

		dessertComboBox = new JComboBox();
		dessertComboBox.setModel(new DefaultComboBoxModel(menuManager.getDesserts().toArray()));
		dessertComboBox.setSelectedIndex(0);

		dessertLabel = new JLabel("Dessert:");

		//Generate Menu Button
		generateMenuButton = new JButton("Generate Menu");
		generateMenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entree entree = (Entree) entreeComboBox.getSelectedItem();
				Side side = (Side) sideComboBox.getSelectedItem();
				Salad salad = (Salad) saladComboBox.getSelectedItem();
				Dessert dessert = (Dessert) dessertComboBox.getSelectedItem();

				String name = JOptionPane.showInputDialog("Enter a name for the menu:");

				Menu menu = new Menu(name, entree, side, salad, dessert);

				listModel.addElement(menu);
			}
		});

		//Random Menu Button
		randMenuButton = new JButton("Generate a Random Menu");
		randMenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Enter a name for the menu:");

				MenuManager menuManager = new MenuManager("src/jdn46_MenuManager_v4/dishes.txt");

				Menu randomMenu = menuManager.randomMenu(name);

				listModel.addElement(randomMenu);
			}
		});

		entreeInfo = new JTextArea();
		entreeInfo.setBounds(130,10,600,50);
		entreeInfo.setBorder(new LineBorder(Color.BLACK));
		entreeInfo.setEditable(false);
		entreeInfo.setLineWrap(true);
		entreeInfo.setWrapStyleWord(true);


		sideInfo = new JTextArea();
		sideInfo.setBounds(130, 70,600,50);
		sideInfo.setBorder(new LineBorder(Color.BLACK));
		sideInfo.setEditable(false);
		sideInfo.setLineWrap(true);
		sideInfo.setWrapStyleWord(true);

		saladInfo = new JTextArea();
		saladInfo.setBounds(130,130,600,50);
		saladInfo.setBorder(new LineBorder(Color.BLACK));
		saladInfo.setEditable(false);
		saladInfo.setLineWrap(true);
		saladInfo.setWrapStyleWord(true);

		dessertInfo = new JTextArea();
		dessertInfo.setBounds(130,190,600,50);
		dessertInfo.setBorder(new LineBorder(Color.BLACK));
		dessertInfo.setEditable(false);
		dessertInfo.setLineWrap(true);
		dessertInfo.setWrapStyleWord(true);

		totCals = new JTextArea();
		totCals.setBorder(new LineBorder(Color.BLACK));
		totCals.setBounds(130,250,50,25);
		totCals.setEditable(false);

		calLabel = new JLabel("Total Calories: ");

		totPrice = new JTextArea();
		totPrice.setBorder(new LineBorder(Color.BLACK));
		totPrice.setBounds(130,310,50,25);
		totPrice.setEditable(false);

		priceLabel = new JLabel("Total Price: ");


		JFrame dFrame = new JFrame("Menu Details");
		//Details Button + second window
		details = new JButton("Details");
		details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (menuList.getSelectedValue() != null) {

					Menu selected = menuList.getSelectedValue();

					dFrame.setTitle(selected + " - Details");

					entreeInfo.setText(selected.getEntree().getDescription() + ". Calories: " + selected.getEntree().getCalories() + ". Price: " + selected.getEntree().getPrice());
					sideInfo.setText(selected.getSide().getDescription() + ". Calories: " + selected.getSide().getCalories() + ". Price: " + selected.getSide().getPrice());
					saladInfo.setText(selected.getSalad().getDescription() + ". Calories: " + selected.getSalad().getCalories() + ". Price: " + selected.getSalad().getPrice());					
					dessertInfo.setText(selected.getDessert().getDescription() + ". Calories: " + selected.getDessert().getCalories() + ". Price: " + selected.getDessert().getPrice());
					totCals.setText(String.valueOf(selected.totalCalories()));
					totPrice.setText("$"+String.valueOf(selected.totalPrice()));

					dFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					dFrame.setResizable(true);
					dFrame.setBounds(320,120,800,600);
					dFrame.setLocationRelativeTo(null);
					dFrame.setVisible(true);
					dFrame.setLayout(null);
					
					entreeLabel2 = new JLabel("Entree: ");
					sideLabel2 = new JLabel("Side: ");
					saladLabel2 = new JLabel("Salad: ");
					dessertLabel2 = new JLabel("Dessert: ");

					entreeLabel2.setBounds(20,10,200,30);
					sideLabel2.setBounds(20,70,200,30);
					saladLabel2.setBounds(20,130,200,30);
					dessertLabel2.setBounds(20,190,200,30);
					calLabel.setBounds(20,250,200,30);
					priceLabel.setBounds(20,310,200,30);

					dFrame.add(entreeLabel);
					dFrame.add(entreeInfo);
					dFrame.add(sideLabel);
					dFrame.add(sideInfo);
					dFrame.add(saladLabel);
					dFrame.add(saladInfo);
					dFrame.add(dessertLabel);
					dFrame.add(dessertInfo);
					dFrame.add(calLabel);
					dFrame.add(totCals);
					dFrame.add(priceLabel);
					dFrame.add(totPrice);
				}
			}
		});

		delete = new JButton("Delete All");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				listModel.removeAllElements();

			}
		});

		save = new JButton("Save to File");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FileManager fileManager = new FileManager();
		        
		        ArrayList<MenuItem> menuItems = new ArrayList<>(menuList.getModel().getSize());
		        for (int i = 0; i < menuList.getModel().getSize(); i++) {
		            // Get the Menu object from the JList
		            Menu menu = menuList.getModel().getElementAt(i);
		            
		            menuItems.add(menuList);
		        }

				fileManager.writeMenus("data/menus.txt", menuItems);
			}
		});


		//Create Menu Panel
		JPanel cPanel = new JPanel();
		cPanel.setBounds(30, 10, 400, 350);
		cPanel.setBorder(new TitledBorder("Build Your Own Menu"));
		cPanel.setLayout(new GridLayout(5,2));
		cPanel.add(entreeLabel);
		cPanel.add(entreeComboBox);
		cPanel.add(sideLabel);
		cPanel.add(sideComboBox);
		cPanel.add(saladLabel);
		cPanel.add(saladComboBox);
		cPanel.add(dessertLabel);
		cPanel.add(dessertComboBox);
		cPanel.add(generateMenuButton);
		mainFrame.add(cPanel);

		//Random Menu Panel
		JPanel rPanel = new JPanel();
		rPanel.setBounds(30,400,400,150);
		rPanel.setBorder(new TitledBorder("Generate A Menu"));
		rPanel.setLayout(new BorderLayout());
		rPanel.add(randMenuButton, BorderLayout.CENTER);
		mainFrame.add(rPanel);

		//Created Menu Panel
		JPanel createdPanel = new JPanel();
		createdPanel.setBounds(440, 10, 340, 540);
		createdPanel.setBorder(new TitledBorder("Created Menus"));
		createdPanel.add(scrollPane);
		createdPanel.add(details);
		createdPanel.add(delete);
		createdPanel.add(save);
		mainFrame.add(createdPanel);

	}

	public static void main(String[] args) {
		MenuManagerGUI gui = new MenuManagerGUI();

		gui.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.mainFrame.setResizable(false);
		gui.mainFrame.setLayout(null);
		gui.mainFrame.setBounds(320,120,800,600);
		gui.mainFrame.setVisible(true);
	}
}