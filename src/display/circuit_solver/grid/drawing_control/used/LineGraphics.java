package display.circuit_solver.grid.drawing_control.used;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import display.circuit_solver.grid.GridPanel;

public class LineGraphics {

	static void drawLines(Graphics g,int x_start,int y_start,int x_final,int y_final) {
        Graphics2D g2d = (Graphics2D) g;
        GridPanel.line = new Line2D.Float(x_start, y_start, x_final, y_final);
        g2d.setStroke(new BasicStroke(3));
        g2d.draw(GridPanel.line);
        
        if(LineHolder.lines.size()!=0){
        	for(int i = 0;i<LineHolder.lines.size();i++){
        g2d.draw(LineHolder.lines.get(i));
        	}
        }
    }
 
    public static void paint(Graphics g,int x_start,int y_start,int x_final,int y_final) {
    	GridPanel.panel_map.paint(g);
        drawLines(g,x_start,y_start,x_final,y_final);
    	}
	}
