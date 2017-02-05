package core;

import components.resistors.Resistor;

import display.DisplayMenu;

public class Core {
	
	public static void main (String[]args){
		Resistor r = new Resistor("RED","GRE","ORA","ORA");
		
		DisplayMenu.constructor();
	}

}
