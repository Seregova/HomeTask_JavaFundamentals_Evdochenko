package by.htp.method_app.main;

import java.util.Scanner;

//6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника. 


public class Task06Method {
	
	public static void main(String [] args) {
		
		System.out.println("Введите сторону a правильного шестиугольника");

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		double s = 6 * triangleSquare(a);
		System.out.println("Площадь шестиугольника равна: " + s);
	}	
	public static double triangleSquare(double b) {
		
		double triangle = Math.sqrt(3) / 4 * (b * b);
		return triangle;
	}
}
