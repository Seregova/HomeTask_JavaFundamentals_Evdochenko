package by.htp.method_app.main;

import java.util.Scanner;

//12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади

public class Task12Method {
	
	public static void main(String [] args) {

		System.out.println("Введите 4 стороны четырехугольника");
	
		Scanner sc = new Scanner(System.in);
	
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();

	
		double sq = square(a, b, c, d); 
		
		System.out.println("Площадь четырехугольника равна: " + sq);
	}
	
	public static double square(double x, double y, double z, double q) {
		
		double hp = (x + y + z + q) / 2;
		double square = Math.sqrt((hp - x) * (hp - y) * (hp - z) * (hp -q));
		return square;
	}
	
}
