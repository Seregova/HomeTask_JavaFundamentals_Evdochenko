package by.htp.branch_app.main;

import java.util.Scanner;

// 11. Составить программу, которая определит площадь какого треугольника больше. 
//Площадь треугольника по формуле Герона 

public class Task11Branch {
	
	public static void main(String [] args) {
		
		System.out.println("Введите 3 стороны первого треугольника");
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double S1 = squareTriangle(a, b, c);
			
		System.out.println("Введите 3 стороны второго треугольника");
		
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		double S2 = squareTriangle(d, e, f);
		
				if (S1 > S2) {
						System.out.println("Площадь первого треугольника больше");
				} else  if (S1 < S2) {
						System.out.println("Площадь второго треугольника больше");
				} else  {
						System.out.println("Площади равны");
				}
	}

	private static double squareTriangle(int x, int y, int z) {
		int h = (x + y + z)/2; 
		double square = Math.sqrt(h * (h - x) * (h - y) * (h - z));
        return square;
	}
	
}

