package methodOverloading;

public class Claculator {
	public void add(int a, int b){
	System.out.println(a+b);
		}
	public double add(double a, double b ){
		//System.out.println(a+b+c);
		return(a+b);
	}
	
	public static void main(String[] args){
		Claculator basiccal = new Claculator();
		basiccal.add(50, 20);
		System.out.println(basiccal.add(50.5, 20.6));
	}
		
	}
