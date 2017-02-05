package display.circuit_solver.options.operation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import display.circuit_solver.components.ComponentsPanel;
import display.circuit_solver.options.Action;
import display.circuit_solver.options.OptionsPanel;
import display.circuit_solver.options.components.ComponentPanel;
import display.circuit_solver.options.components.ComponentPanelCheckBox;

public class OperationListener implements ActionListener {
	
	boolean clicked = false;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = (String) ((JComboBox)e.getSource()).getSelectedItem();
	
		if(!command.equals("Select from below")){
			setAction(command);
		}
	}
	
	public void setAction(String command){
		if(clicked){
			OptionsPanel.option_panel.remove(ComponentPanel.button);
			System.out.println("remove");
			ComponentsPanel.panel_component.removeAll();
		}
		clicked = true;
		
		Action action = new Action(command);
		ComponentPanelCheckBox.chooseBox(action, command);
		JCheckBox[] current_box = ComponentPanelCheckBox.chooseBox(action, command);
		ComponentPanel.display(OptionsPanel.option_panel, current_box);
		
		OptionsPanel.option_panel.add(ComponentPanel.button);
		OptionsPanel.option_panel.revalidate();
	}

}
