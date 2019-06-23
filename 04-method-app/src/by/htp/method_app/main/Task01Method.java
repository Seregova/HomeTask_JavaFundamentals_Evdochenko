package by.htp.method_app.main;

import java.util.Scanner;

//1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади. 

public class Task01Method {
		
	public static void main(String [] args) {
	
		System.out.println("Введите координаты вершин треугольника");
	
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
	
		double Square = triangleSquare(x1, y1, x2, y2, x3, y3);
		
			if (Square < 0) {
				System.out.println(Math.abs(-Square));
			}
			if (Square >0) {
				System.out.println(Square);
			}
		
	}
	
	private static double triangleSquare(int a1, int b1, int a2, int b2, int a3, int b3) {
		
		double triangleSquare = ((a1 - a3) * (b2 - b3) - (a2 - a3) *(b1 - b3)) / 2 ;
		
		return triangleSquare;
	}

}