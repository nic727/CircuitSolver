package display.color_code;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import components.resistors.Resistor;

public class DisplayColorCode5 {
	public static JPanel p;
	public static JLabel label;
	
	public static void colorCode(){
		final JFrame f = new JFrame();
		p = new JPanel();
		Initializer.initializeButtons();
		Initializer.initializeImage();
		
		label = new JLabel("", Initializer.img2, JLabel.CENTER);

		label.setBounds(50, 50, 500, 100);
		label.setLocation(0, 300);

		label.setLayout(null);
		label.setVisible(true);

		JDialog d = new JDialog(f, "Hello", true);
		d.setLocationRelativeTo(f);
		d.setSize(500, 500);
		d.setLayout(null);
		
		//temporary - warning that this window does not yet work
		JLabel warning = new JLabel();
		warning.setForeground(Color.RED);
		warning.setText("This page is not finished");
		warning.setBounds(100, 60, 200, 50);
		warning.setLayout(null);
		p.add(warning);
		////////////////////////////////////////////////////////

		p.setLayout(null);
		ButtonActionHandler.getColorButtonAction(p,Initializer.bands3,Initializer.bands3);
		ButtonActionHandler.getControlButtonAction(p,5);
		d.setContentPane(p);

		Initializer.addButtons(p, label);

		d.setVisible(true);
	}
}
