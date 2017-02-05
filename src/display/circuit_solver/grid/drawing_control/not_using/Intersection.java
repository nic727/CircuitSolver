package display.circuit_solver.grid.drawing_control.not_using;



public class Intersection {
	
	public int x;
	public int y;
	
	/**
	 * return closest intersections from intersection
	 * @param point
	 * @return
	 */
	public static Point2D[] getClosestFI(Point2D point){
		
		Point2D[] points = new Point2D[getNumberOfAdjacent(point)];
		
		if(point.isInCorner()){
			if(point.getX() == Grid.getBoundsLX()){
				if(point.getY() == Grid.getBoundsUY()){
					
					points[0] = new Point2D(point.getX(), getNextDY(point));
				}else{
					points[0] = new Point2D(point.getX(), getNextUY(point));
				}
				points[1] = new Point2D(getNextPX(point), point.getY());
			}else{
				if(point.getY() == Grid.getBoundsUY()){
					points[0] = new Point2D(point.getX(), getNextDY(point));
				}else{
					points[0] = new Point2D(point.getX(), getNextUY(point));
				}
				points[1] = new Point2D(getNextLX(point), point.getY());
			}
			
		}else{
			if(point.isOnEdge()){
				if(point.getX() == Grid.getBoundsLX() || point.getX() == Grid.getBoundsRX()){
					points[0] = new Point2D(point.getX(), getNextUY(point));
					points[1] = new Point2D(point.getX(), getNextDY(point));
					
					if(point.getX() == Grid.getBoundsLX()){
						points[2] = new Point2D(getNextPX(point), point.getY());
					}else{
						points[2] = new Point2D(getNextLX(point), point.getY());
					}
				}else{
					points[0] = new Point2D(getNextLX(point), point.getY());
					points[1] = new Point2D(getNextPX(point), point.getY());
					
					if(point.getY() == Grid.getBoundsUY()){
						points[2] = new Point2D(point.getX(), getNextDY(point));
					}else{
						points[2] = new Point2D(point.getX(), getNextUY(point));
					}
				}
			}else{
				points[0] = new Point2D(point.getX(), getNextUY(point));
				points[1] = new Point2D(point.getX(), getNextDY(point));
				points[2] = new Point2D(getNextLX(point), point.getY());
				points[3] = new Point2D(getNextPX(point), point.getY());
			}
		}
			
		return points;
		}
	
	/**
	 * return number of closest intersections from intersection
	 * @param point
	 * @return
	 */
	public static int getNumberOfAdjacent(Point2D point) {

		if(point.isInCorner()){
			return 2;
		}else{
			if(point.isOnEdge()){
				return 3;
			}else{
				return 4;
			}
		}
	}

	/**
	 * check if point is an intersection
	 * @param point
	 * @return
	 */
	public static boolean isIntersection(Point2D point){
		if((point.getX() % 47 == 0) && (point.getY() % 47 == 0)){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * return distance of point from closest intersection
	 */
	public static int getDistanceOfClosest(Point2D point){
		int distance = 0;
		
		if(Line.isOnLine(point)){
		
			if(isIntersection(point)){
				distance = 0;
				}else{
					if(Line.isOnHLine(point)){
						distance = Math.min(point.getX() % 47, 47 - (point.getX() % 47));
					}else{
						if(Line.isOnVLine(point)){
							distance = Math.min(point.getY() % 47, 47 - (point.getY() % 47));
						}else{		
						}
					}
				}
		}else{
			distance = -1;
		}
		return distance;
		}
	
	/**
	 * return closest intersection from point
	 * @param point
	 * @return
	 */
	public static Point2D getClosestFP(Point2D point){
		Point2D p;
		int x,y;
		
			if(Line.isOnLine(point)){
				if(Line.isOnHLine(point)){
					x = Math.min(point.getX()+getDistanceOfClosest(point),point.getX()-getDistanceOfClosest(point));
					
					p = new Point2D(x,point.getY());
				}else{
					y = Math.min(point.getY()+getDistanceOfClosest(point),point.getY()-getDistanceOfClosest(point));
					
					p = new Point2D(point.getX(),y);
				}
			}else{
			p = new Point2D(-1,-1);
		}
		
		return p;
	}
	
	/**
	 * return coordinates of next intersection
	 * @param point
	 * @return
	 */
	public static int getNextLX(Point2D point) {
		int nextX = point.getX() - 47;

		return nextX;
	}

	public static int getNextUY(Point2D point) {
		int nextY = point.getY() - 47;

		return nextY;
	}

	public static int getNextPX(Point2D point) {
		int nextX = point.getX() + 47;

		return nextX;
	}

	public static int getNextDY(Point2D point) {
		int nextY = point.getY() + 47;

		return nextY;
	}


}




























