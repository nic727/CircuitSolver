package display.circuit_solver.grid.drawing_control.used;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CustomKeyListener implements KeyListener{
	public static boolean holded = false;
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SHIFT){
			holded = true;
			System.out.println("holded: "+holded);
		}

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SHIFT){
			holded = false;
			System.out.println("holded: "+holded);
		}
	}	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
