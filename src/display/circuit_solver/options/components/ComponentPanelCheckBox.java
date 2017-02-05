package display.circuit_solver.options.components;

import javax.swing.JCheckBox;

import display.circuit_solver.options.Action;

public class ComponentPanelCheckBox {
	
	public static JCheckBox[] box,current_box;
	public static String[] description;
	
	public static void generateOptions(){
		
		box = new JCheckBox[6];
		description = new String[6];
		checkBoxDescription();

		
		for(int i =0;i<box.length;i++){
			
			box[i] = new JCheckBox(new CheckBoxAction(i));
			box[i].setText(description[i]);

		}
	}
	
	public static void checkBoxDescription(){
		
		description[0] = "resistor";
		description[1] = "capacitor";
		description[2] = "inductor";
		description[3] = "voltage source";
		description[4] = "current source";
		description[5] = "LED diode";		
		//description[6] = "diode";		
		//description[7] = "transistor";	
	}
	public static JCheckBox[] chooseBox(Action action, String str){
		generateOptions();
		String s = action.getNamesOfComponents(action.getN(str));
		char[] c = s.toCharArray();
		System.out.println("components: "+s);
		JCheckBox[] current_box = new JCheckBox[s.length()];
		
		for(int i = 0;i<s.length();i++){
			current_box[i] = box[Character.getNumericValue(c[i])];
			System.out.println("box name: "+current_box[i].getText());
		}
		
		
		
		return current_box;
		
	}
}
