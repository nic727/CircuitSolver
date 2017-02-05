package display.circuit_solver.grid.drawing_control.not_using;



public class Point2D {

	public int x;
	public int y;

	public Point2D(int x, int y) {

		this.x = x;
		this.y = y;

	}

	public int getX() {

		return x;
	}

	public int getY() {

		return y;
	}

	public int getNextLX() {
		int nextX = x - 1;

		return nextX;
	}

	public int getNextUY() {
		int nextY = y - 1;

		return nextY;
	}

	public int getNextPX() {
		int nextX = x + 1;

		return nextX;
	}

	public int getNextDY() {
		int nextY = y + 1;

		return nextY;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	public boolean isValid() {
		if (getX() <= Grid.getBoundsRX() && getX() >= Grid.getBoundsLX()
				&& getY() <= Grid.getBoundsDY() && getY() >= Grid.getBoundsUY()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isInCorner() {
		if ((getX() == Grid.getBoundsLX() && (getY() == Grid.getBoundsUY() || getY() == Grid
				.getBoundsDY()))
				|| (getX() == Grid.getBoundsRX() && (getY() == Grid
						.getBoundsUY() || getY() == Grid.getBoundsDY()))) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOnEdge() {
		if (getX() == Grid.getBoundsLX() || getX() == Grid.getBoundsRX()
				|| getY() == Grid.getBoundsUY() || getY() == Grid.getBoundsDY()) {
			if (isInCorner() == false) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}


}
