package by.htp.method_app.main;

//10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 

public class Task10Method {
	
	public static void main(String [] args) {
		
		int sum = 0;
		for (int i = 1; i <=9; i = i + 2) {
			sum = sum + factorial(i);
		}
		System.out.println(sum);
	}
	
	private static int factorial(int x) {
		
		int fact = 1;
		for (int i = 1; i <= x; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
}
