package by.htp.cycle_app.main;

//5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно. 

public class Task05Cycle {
	
	public static void main(String[] args){
		
		int i = 1;
		int sum = 0;
	
		while ( i <= 99 ) { 
			if ( i % 2 != 0) {
				sum = sum + i;
				System.out.println(i);
			} 
			i++;
		}
		
		System.out.println("Сумма:" + sum);
	}
}