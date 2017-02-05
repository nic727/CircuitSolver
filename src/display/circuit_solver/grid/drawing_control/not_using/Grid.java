package display.circuit_solver.grid.drawing_control.not_using;



public class Grid {

	public Point2D[] grid;
	int x;
	int y;

	public static void main(String[] args) {
		Point2D point = new Point2D(59,47);
		Point2D[] c_points = Intersection.getClosestFI(point);

		System.out.println("original: " + point.getX() + "," + point.getY());
		System.out.println("number of closest points: "
				+ Intersection.getNumberOfAdjacent(point));
		System.out.println("validity: "+point.isValid());
		System.out.println("isIntersection: "+Intersection.isIntersection(point));
		System.out.println("is in corner: "+ point.isInCorner());
		System.out.println("is on edge: "+ point.isOnEdge());
		
		System.out.println("is on line: "+Line.isOnLine(point));
		System.out.println("is on Vline: "+Line.isOnVLine(point));
		System.out.println("is on Hline: "+Line.isOnHLine(point));
		
		
		System.out.println("point x % 47: "+ point.getX()%47);
		System.out.println("47 - (point x % 47): "+ (47 - (point.getX()%47)));
		
		System.out.println("point y % 47: "+ point.getY()%47);
		System.out.println("47 - (point y % 47): "+ (47 - (point.getY()%47)));
		
		System.out.println("distance from point: "+Intersection.getDistanceOfClosest(point));
		System.out.println("closest intersection: "+Intersection.getClosestFP(point).getX()+" , "+Intersection.getClosestFP(point).getY());
		
		for(int i = 0;i<c_points.length;i++){
			if(Intersection.isIntersection(point)){
				System.out.println("point "+i+": "+c_points[i]);
			}else{
				System.out.println("sorry the point is not an intersection iself");
				break;
			}
		}

	}

	public Grid() {

	}
	
	public static int getBoundsLX(){
		int BoundLX = 0;
		return BoundLX;
	}
	
	public static int getBoundsRX(){
		int BoundRX = 846;
		return BoundRX;
	} 
	
	public static int getBoundsUY(){
		int BoundUY = 0;
		return BoundUY;
	}

	public static int getBoundsDY(){
		int BoundDY = 846;
		return BoundDY;
	}
}

