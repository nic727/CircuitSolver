package components.resistors;

public enum Band {
	BLACK(0,0,0,1),BROWN(1,1,1,10),RED(2,2,2,100),ORANGE(3,3,3,1000),
	YELLOW(4,4,4,10000),GREEN(5,5,5,100000),BLUE(6,6,6,1000000),
	VIOLET(7,7,7,10000000),GREY(8,8,8,100000000),WHITE(9,9,9,1000000000);



	private Band(int first_band, int second_band, int third_band,
			int fourth_band) {
		
		this.first = first_band;
		this.second = second_band;
		this.third = third_band;
		this.fourth = fourth_band;
	}
	
	final public int first;
	final public int second;
	final public int third;
	final public int fourth;
	
	static Band color(String name){
		System.out.println("name: "+name);
		switch(name){
		case "BLA":
			return BLACK;
		case "BRO":
			return BROWN;
		case "RED":
			return RED;
		case "ORA":
			return ORANGE;
		case "YEL":
			return YELLOW;
		case "GRE":
			return GREEN;
		case "BLU":
			return BLUE;
		case "VIO":
			return VIOLET;
		case "GRY":
			return GREY;
		case "WHI":
			return WHITE;
		default:
			System.out.println("invalid input");
		}
		
		throw new IllegalArgumentException();
		
		
	}
}
