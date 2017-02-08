package display;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import display.circuit_solver.DisplayChoice;
import display.circuit_solver.DisplayCircuitSolver;

public class DisplayMenu {
	
	public static JButton button_colorCode;
	public static JButton button_circuitSolver;	
	public static Color custom_GRAY;
	
	public static void constructor(){
		JFrame frame = new JFrame("Circuit solver");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLocation(600,50);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        custom_GRAY = Color.decode("#696969");
        panel.setBackground(custom_GRAY);
        
        buttonAction();
         
        frame.setContentPane(panel);
        frame.setVisible(true);
        panel.add(button_colorCode);
        panel.add(button_circuitSolver);
        frame.repaint();
	}
	
	public static void buttons(){
		
        button_colorCode = new JButton("Color code");
        button_circuitSolver = new JButton("Circuit solver");
        button_colorCode.setFont(new Font("Monospaced",Font.BOLD,12));
        button_circuitSolver.setFont(new Font("Monospaced",Font.BOLD,12));
        
        button_colorCode.setLayout(null);
        button_circuitSolver.setLayout(null);

        button_colorCode.setBounds(50, 50, 150, 30);
        button_colorCode.setLocation(180,100);
        button_circuitSolver.setBounds(50, 50, 150, 30);
        button_circuitSolver.setLocation(180,200);
	}

	public static void buttonAction(){
		buttons();
		
		button_colorCode.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button clicked!");
				DisplayChoice.displayChoice();
			}
			
		});
		button_circuitSolver.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button2 clicked!");
				
				DisplayCircuitSolver.circuitSolver();
			}
			
		});
	}

}
