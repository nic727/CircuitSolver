package display.circuit_solver.components;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import display.circuit_solver.DisplayCircuitSolver;
import display.circuit_solver.options.components.ComponentPanelCheckBox;

public class ComponentsPanel {
	
	public static JPanel panel_component;
	public JLabel label; 
	
	public ComponentsPanel(){
		
		panel_component = new JPanel();
		
		label = new JLabel();
		label.setText("Components here");
		label.setBounds(300, 100, 300, 300);
		label.setLayout(null);
		label.setVisible(true);
		
		
		DisplayCircuitSolver.base_panel.add(panel_component);
		panel_component.add(label);
		
		panel_component.setLayout(new FlowLayout());
		panel_component.setBorder(BorderFactory
				.createEtchedBorder(EtchedBorder.LOWERED));
		panel_component.setVisible(true);
		
		
	}

}
