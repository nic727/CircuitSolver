package display.circuit_solver.grid.drawing_control.used;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import display.circuit_solver.grid.GridPanel;

public class LineGraphics {

	static void drawLines(Graphics g, int x_start, int y_start, int x_final, int y_final) {
		Graphics2D g2d = (Graphics2D) g;
		GridPanel.line = new Line2D.Float(x_start, y_start, x_final, y_final);
		g2d.setStroke(new BasicStroke(3));
		g2d.draw(GridPanel.line);

		if (LineHolder.lines.size() != 0) {
			for (int i = 0; i < LineHolder.lines.size(); i++) {
				g2d.draw(LineHolder.lines.get(i));
			}
		}
	}

	public static void paint(Graphics g, int x_start, int y_start, int x_final, int y_final) {
		//super.paint(g);
		g.setColor(Color.RED);
		
//		int x_start = GridPanel.line_specification.get(0);
//		int y_start = GridPanel.line_specification.get(1);
//		int x_final = GridPanel.line_specification.get(2);
//		int y_final = GridPanel.line_specification.get(3);
		
		GridPanel.panel_map.paint(g);
		drawLines(g, x_start, y_start, x_final, y_final);
	}
}
