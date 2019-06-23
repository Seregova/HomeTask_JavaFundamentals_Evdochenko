package by.htp.cycle_app.main;

//11. Составить программу нахождения разности кубов первых двухсот чисел 

public class Task11Cycle {

	public static void main(String[] args){
		
		int sub = 0;
		
		for (int i = 1; i <= 200; i++) {
			sub = sub - (i * i * i);
		}
		
		System.out.println(sub);
	}
}

