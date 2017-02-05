package components.resistors;

import components.Component;


public class Resistor implements Component {
	
	private int resistance;
	private int n = 0;
	private Band first_band4;
	private Band second_band4;
	private Band third_band4;
	private Band fourth_band4;
	
	private Band first_band5;
	private Band second_band5;
	private Band third_band5;
	private Band fourth_band5;
	private Band fifth_band5;
	
	public Resistor(int resistance){
		this.resistance = resistance;
		n = 1;
		
	}
	
	public Resistor(String first_band4, String second_band4,
			String third_band4, String fourth_band4) {
		
		this.first_band4 = Band.color(first_band4);
		this.second_band4 = Band.color(second_band4);
		this.third_band4 = Band.color(third_band4);
		this.fourth_band4 = Band.color(fourth_band4);
		
		n = 2;
	}
	
	public Resistor(String first_band5, String second_band5,
			String third_band5, String fourth_band5, String fifth_band5) {
		
		this.first_band5 = Band.color(first_band5);
		this.second_band5 = Band.color(second_band5);
		this.third_band5 = Band.color(third_band5);
		this.fourth_band5 = Band.color(fourth_band5);
		this.fifth_band5 = Band.color(fifth_band5);
		
		n = 3;
	}

	public int getResistance(){
		int result = 0;
		
		switch(n){
		case 1:
			result = resistance;
		case 2:
			result = (first_band4.first*10+second_band4.second)*third_band4.fourth;
			break;
		case 3:
			result = (first_band5.first*100+second_band5.second*10+third_band5.third)*fourth_band5.fourth;
			break;
		default:
			result = 0;
		}
		return result;
	}
	
	public String getColorCode(){
		StringBuilder sb = new StringBuilder();
		String color_code;
		
		switch(n){
		case 1:
			System.out.println("now enough information");
			break;
		case 2:
			sb.append(first_band4);
			sb.append(second_band4);
			sb.append(third_band4);
			sb.append(fourth_band4);
			break;
		case 3:
			sb.append(first_band5);
			sb.append(second_band5);
			sb.append(third_band5);
			sb.append(fourth_band5);
			sb.append(fifth_band5);
			break;
		}
		color_code = sb.toString();
		
		return color_code;
		}
	public static String toString(int num){
		if(num<1000) return num+"Ohm";
		else if(num<1000000) return num/1000 + "KOhm";
		else return num/1000000 + "MOhm";
		
	}
}

