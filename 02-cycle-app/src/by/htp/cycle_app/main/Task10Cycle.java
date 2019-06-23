package by.htp.cycle_app.main;

//10. Составить программу нахождения произведения квадратов первых двухсот чисел. 

public class Task10Cycle {
	
	public static void main(String[] args){
		
		double mul = 1;
		
		for (double i = 1; i <= 200; i++) {
			mul = mul * (i * i);
		}
		
		System.out.println(mul);
	
	}
}