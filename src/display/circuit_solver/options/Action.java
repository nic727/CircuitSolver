package display.circuit_solver.options;

public class Action {
	public int n;
	public String str;
	public static int[] numOfComponents;
	public static String[] nameOfComponents;
	
	public Action (String str){
		this.str = str;
		getAction(n);
	}
	
	public int getN(String str){
		
		switch(str){
		case "Select from below":
			n = 0;
			break;
		case "A":
			n = 1;
			break;
		case "B":
			n = 2;
			break;
		default:
			System.out.println("wrong input");
		}
		
		return n;
	}
	
	public void getAction(int n){
		
		switch(n){
		case 0:
			System.out.println("case 0");
			break;
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		default:
			System.out.println("mistakes were made");
			break;
		}	
	}
	
	public static int getNumberOfComponents(int n){
		numOfComponents = new int[10];
		
		numOfComponents[0] = 1;
		numOfComponents[1] = 2;
		numOfComponents[2] = 3;
		
		return numOfComponents[n];	
	}
	
	public static String getNamesOfComponents(int n){
		nameOfComponents = new String[10];
		
		nameOfComponents[0] = "0";
		nameOfComponents[1] = "01";
		nameOfComponents[2] = "012"; 
		
		return nameOfComponents[n];
	}

}
