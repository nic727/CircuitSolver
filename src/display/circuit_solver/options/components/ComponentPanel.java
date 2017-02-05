package display.circuit_solver.options.components;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import display.circuit_solver.options.operation.OperationListener;

public class ComponentPanel {
	
	public static JButton button;
	
	@SuppressWarnings("serial")
	public static void display(JPanel p, JCheckBox[] box){
		
		final JPopupMenu menu = new JPopupMenu();
	 	ComponentPanelCheckBox.generateOptions();
		
			for(int i = 0;i<box.length;i++){
				menu.add(box[i]);
	 	}

		button = new JButton();
		button.setAction(new AbstractAction("Components") {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        menu.show(button, 0, button.getHeight());
		    }
		});
	}

}
