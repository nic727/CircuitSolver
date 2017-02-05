package display.circuit_solver.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import display.circuit_solver.grid.GridPanel;
import display.circuit_solver.grid.mouse_listeners.CustomMouseListener;
import display.circuit_solver.options.components.ComponentPanelCheckBox;
	
public class ComponentAdder {
	
	public static JLabel[] labels;
	public static JLabel[] label_components;
	public static BufferedImage bi;
	public static Image[] components;
	public static ImageIcon[] componentsIcon; 
	public static ImageIcon[] comp;
	
	public int n;
	public static boolean initialized = false;
	public static JButton[] component;
	
	public static void addComponent(int n){
	
		
		if(initialized == false){
			components = new Image[6];
			componentsIcon = new ImageIcon[6];
			component = new JButton[10];
		}
		initialized = true;
		
		System.out.println(ComponentPanelCheckBox.description[n]+" added");
		
		component[n] = new JButton();
		component[n].setLayout(null);
		component[n].setBounds(10, 10, 100, 100);
		component[n].setVisible(true);
		try {
			bi = ImageIO.read(new File("src/components/images/components.png"));
				
				components[n] = bi.getSubimage(0, n*41, 81, 41);
				componentsIcon[n] = new ImageIcon(components[n]);
				
				//creates buttons of components
				component[n].setIcon(componentsIcon[n]);
				ComponentsPanel.panel_component.add(component[n]);	
				ComponentsPanel.panel_component.revalidate();
				getAction(n);
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void takeComponent(int n){
		
		//removes buttons of components
		ComponentsPanel.panel_component.remove(component[n]);
		ComponentsPanel.panel_component.revalidate();
		
		System.out.println("take component n: "+n);
	}
	
	public static void getAction(final int n){
		label_components = new JLabel[4];
		comp = new ImageIcon[4];
		
		component[n].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button clicked");
				switch(n){
				case 0:
					System.out.println("0");
					comp[n] = new ImageIcon(
							"src/display/circuit_solver/components/components_images/resistor_component.png");
					getImage(n);
					break;
				case 1:
					System.out.println("1");
					comp[n] = new ImageIcon(
							"src/display/circuit_solver/components/components_images/capacitor_component.png");
					getImage(n);
					break;
				case 2:
					System.out.println("2");
					break;
				}
				
			}});
	}
	public static void getImage(int n){
		label_components[n] = new JLabel(comp[n]);
		label_components[n].setLayout(null);
		label_components[n].setVisible(true);
		//label_components[n].addMouseListener(new CustomMouseListener());

	//	GridPanel.panel_inv.add(label_components[n]);
		GridPanel.panel_map.setComponentZOrder(GridPanel.panel_inv, 0);
		GridPanel.panel_inv.setOpaque(false);
		GridPanel.panel_map.revalidate();
	}
	
}
