package display.circuit_solver.grid;

import java.awt.BorderLayout;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.border.EtchedBorder;

import display.circuit_solver.DisplayCircuitSolver;
import display.circuit_solver.grid.drawing_control.used.CustomKeyListener;
import display.circuit_solver.grid.drawing_control.used.LineHolder;
import display.circuit_solver.grid.mouse_listeners.CustomMouseListener;
import display.circuit_solver.grid.mouse_listeners.CustomMouseMotionListener;

public class GridPanel {

	public static JPanel panel_map;
	public static JPanel panel_inv;
	public static JLabel label;
	JLabel[][] labels;
	
	public static int n=0;
	public static int x_start;
	public static int y_start;
	public static int x_final;
	public static int y_final;
	public static int lines_number;
	public static boolean active = false;
	public static Line2D.Float line;
    ImageIcon map;

	public GridPanel(JPanel p) {
		LineHolder.lines = new ArrayList<Line2D.Float>();
		generateMap(p);
	}
	
	public void generateMap(JPanel p) {
		panel_map = new JPanel(){
			 public boolean isOptimizedDrawingEnabled() {
			        return false;
			      }
			    };
	    panel_inv = new JPanel(new BorderLayout());

			    
		OverlayLayout layout = new OverlayLayout(panel_map);	    
		
		
		panel_map.setLayout(layout);
		panel_map.setBorder(BorderFactory
						.createEtchedBorder(EtchedBorder.LOWERED));
     	panel_map.setVisible(true);
     	panel_map.addMouseListener(new CustomMouseListener());
		panel_map.addMouseMotionListener(new CustomMouseMotionListener());
		panel_map.setFocusable(true);
		panel_map.addKeyListener(new CustomKeyListener());
		
		panel_inv.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		panel_inv.setVisible(true);
		
		//invisible panel on map_panel
		//panel_map.add(panel_inv);

		
		map = new ImageIcon(
				"src/display/circuit_solver/images/map.png");

		label = new JLabel();
		label.setIcon(map);
		label.setLayout(null);
		label.setVisible(true);
		
		p.add(panel_map);

		panel_map.add(label);
		panel_map.setComponentZOrder(label, 0);
	}

	}

