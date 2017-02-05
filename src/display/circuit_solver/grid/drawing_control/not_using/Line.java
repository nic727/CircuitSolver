package display.circuit_solver.grid.drawing_control.not_using;


public class Line {
	
	public static boolean isOnLine(Point2D point){
		
		if(isOnVLine(point) || isOnHLine(point)){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isOnVLine(Point2D point){
		if(point.getX() % 47 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isOnHLine(Point2D point){
		if(point.getY() % 47 == 0){
			return true;
		}else{
			return false;
		}
	}
	
}
