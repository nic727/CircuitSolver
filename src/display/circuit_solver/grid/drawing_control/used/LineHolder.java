package display.circuit_solver.grid.drawing_control.used;

import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Float;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import display.circuit_solver.grid.GridPanel;

public class LineHolder {
	
	static int n = 0;
	
	public static ArrayList<Line2D.Float> lines;
	
	public static void displayLines(){
		System.out.println("number of lines: "+GridPanel.lines_number);
		
		if(GridPanel.n % 2 == 1){
			System.out.println("still painting");
		}else{
			System.out.println("line finished");
			System.out.println(GridPanel.lines_number-1);
			lines.add(GridPanel.lines_number-1,GridPanel.line);//new Line2D.Float(GridPanel.x_start,GridPanel.y_start,GridPanel.x_final,GridPanel.y_final));
		
		}
		System.out.println("the size of array is :"+lines.size());
		n++;
	}
	public static void removeLine(int index){
		lines.remove(index);
		
	}
	
	//return index of the line that was clicked
	public static int lineClicked(int x, int y){
		
		Rectangle hit_box = new Rectangle(x-10,y-10,20,20);

		for(int i = 0; i<lines.size(); i++){			
			if(lines.get(i).intersects(hit_box)){
				return i;
			}
		}
		
		return -1;
	}

}
