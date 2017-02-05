package display.circuit_solver.drawing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Line {
	
	
	public Line(int a,int b,int c,int d, Graphics g) {
		Graphics2D g2 = (Graphics2D) g; 
		Line2D line = new Line2D.Float(a,b,c,d);
		g2.draw(line);
	}

}
