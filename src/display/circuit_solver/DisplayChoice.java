package display.circuit_solver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import display.color_code.DisplayColorCode4;
import display.color_code.DisplayColorCode5;

public class DisplayChoice {
	
	public static JPanel p;
	public static JButton band_4,band_5;
	
	public static void displayChoice(){
		
		final JFrame f = new JFrame();
		p = new JPanel();
		
		JDialog d = new JDialog(f,"choice",true);
		d.setLocationRelativeTo(f);
		d.setSize(300, 200);
		d.setLayout(null);
		
		p.setLayout(null);
		d.setContentPane(p);
		
		buttonAction();
		
		p.add(band_4);
		p.add(band_5);
		
		d.setVisible(true);
	}
	public static void buttons(){
		band_4 = new JButton();
		band_5 = new JButton();
		
		band_4.setText("four");
		band_5.setText("five");
		band_4.setLayout(null);
		band_5.setLayout(null);
		band_4.setBounds(20, 80, 100, 50);
		band_5.setBounds(170, 80, 100, 50);
	}	
	public static void buttonAction(){
		buttons();
		
		band_4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("four clicked");
				DisplayColorCode4.colorCode();
			}
			
		});
		
		band_5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("five clicked");
				DisplayColorCode5.colorCode();
			}
			
		});
	}
	

}
