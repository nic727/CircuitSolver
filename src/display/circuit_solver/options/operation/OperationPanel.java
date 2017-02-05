package display.circuit_solver.options.operation;

import java.awt.BorderLayout;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class OperationPanel {
	
	public static void display(JPanel option_panel){
		
		JToolBar operationBar = new JToolBar();
		operationBar.setRollover(true);

		
		JComboBox combo = new JComboBox(new String[] {"Select from below","A","B"});
		combo.addActionListener(new OperationListener());
		operationBar.add(combo);
		option_panel.add(operationBar, BorderLayout.EAST);
		
	}

}
