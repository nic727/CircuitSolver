package display.circuit_solver.options.components;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JCheckBox;

import display.circuit_solver.components.ComponentAdder;
import display.circuit_solver.components.ComponentsPanel;

public class CheckBoxAction extends AbstractAction{
	
	public int n;

	public CheckBoxAction(int n) {
   
		this.n = n;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		JCheckBox b = (JCheckBox) e.getSource();
			
        if (b.isSelected()) {
            System.out.println("Switched on: "+ComponentPanelCheckBox.description[n]);
            ComponentAdder.addComponent(n);
            
        } else {
            System.out.println("Switched off: "+ComponentPanelCheckBox.description[n] + " with n = " +n);
            ComponentAdder.takeComponent(n);
        }		
	}
}
