package display.circuit_solver.grid.mouse_listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import display.circuit_solver.grid.GridPanel;
import display.circuit_solver.grid.drawing_control.used.CustomKeyListener;
import display.circuit_solver.grid.drawing_control.used.LineGraphics;


public class CustomMouseMotionListener implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("method moved working holded is now: "+CustomKeyListener.holded);
		System.out.println("n: "+GridPanel.n);

		if(GridPanel.n % 2 == 1){
//			GridPanel.panel_map.addKeyListener(new CustomKeyListener());
			
			if(CustomKeyListener.holded){
				System.out.println("first if called");
				if(Math.abs(GridPanel.x_final-GridPanel.x_start)>Math.abs(GridPanel.y_final-GridPanel.y_start)){
					GridPanel.x_final = e.getX();
					GridPanel.y_final = GridPanel.y_start;

				}else{
					GridPanel.y_final = e.getY();
					GridPanel.x_final = GridPanel.x_start;
				}
			}else{
				GridPanel.x_final = e.getX();
				GridPanel.y_final = e.getY();
	}
				LineGraphics.paint(GridPanel.panel_map.getGraphics(),GridPanel.x_start,GridPanel.y_start,GridPanel.x_final,GridPanel.y_final);
				
			}
	}
}


