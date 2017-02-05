package display.circuit_solver.grid.mouse_listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import display.circuit_solver.components.ComponentAdder;
import display.circuit_solver.grid.GridPanel;
import display.circuit_solver.grid.drawing_control.used.LineHolder;
import display.circuit_solver.options.components.CheckBoxAction;

public class CustomMouseListener implements MouseListener{
	boolean entered = false;
	
    public void mouseClicked(MouseEvent e) {
  	 GridPanel.n++;

       System.out.println("Mouse Clicked: ("+e.getX()+", "+e.getY() +")");
       System.out.println("n is: "+GridPanel.n);
       if(GridPanel.n == 1){
    	   GridPanel.x_start = e.getX();
    	   GridPanel.y_start = e.getY();
    	   GridPanel.active = true;
       }else{
    	   GridPanel.x_final = e.getX();
    	   GridPanel.x_final = e.getY();
    	   GridPanel.active = false;
    	   GridPanel.n=0;
    	   GridPanel.lines_number++;
       }
       LineHolder.displayLines();
       
       
       
       //not completely working
       if(entered){
    	//   ComponentAdder.label_components[0].setText("u clicked on the component lol");;
       }else if(!entered){
//    	   ComponentAdder.label_components[0].setText("");
//    	   ComponentAdder.label_components[0].revalidate();
       }
    }
    
    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    	GridPanel.panel_map.setFocusable(true);
    	
    	if(e.getComponent().getClass() == JLabel.class){
    		System.out.println("in jlabel");
    		entered = true;
    	}
    }

    public void mouseExited(MouseEvent e) {
  	  System.out.println("mouse is not on the map");
  	  
	  	if(e.getComponent().getClass() == JLabel.class){
	  		System.out.println("out of jlabel");
			entered = false;
		}
    }
 }


