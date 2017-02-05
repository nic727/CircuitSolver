package display.circuit_solver.options;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import display.circuit_solver.options.components.ComponentPanel;
import display.circuit_solver.options.operation.OperationPanel;

public class OptionsPanel {

	public static JPanel option_panel;
	
	public static void displayOptions(JPanel p){
		
		option_panel = new JPanel();
		option_panel.setLayout(new FlowLayout());
		option_panel.setBorder(BorderFactory
				.createEtchedBorder(EtchedBorder.LOWERED));
		
		OperationPanel.display(option_panel);
		//ComponentPanel.display(option_panel);
		option_panel.setVisible(true);
		
		p.add(option_panel);
	}
}
