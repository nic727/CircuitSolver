package display.circuit_solver;

import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JPanel;

import display.circuit_solver.components.ComponentsPanel;
import display.circuit_solver.grid.GridPanel;
import display.circuit_solver.options.OptionsPanel;

public class DisplayCircuitSolver {
	
	public static JPanel base_panel;
	
	public static JDialog d;
	public static JFrame frame;
	
	public static void circuitSolver(){
		
		frame = new JFrame();	
		base_panel = new JPanel();
		
		d = new JDialog(frame,"Circuit Solver",true);
		d.setLocationRelativeTo(frame);
		d.setSize(800, 600);
		d.setLayout(null);
		d.setLocation(600, 70);
		d.setContentPane(base_panel);
		OptionsPanel.displayOptions(base_panel);
		
		GridPanel g_panel = new GridPanel(base_panel);
		ComponentsPanel c_panel = new ComponentsPanel();
		
		d.setVisible(true);
	}

}
