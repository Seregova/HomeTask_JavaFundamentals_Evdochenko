package by.htp.branch_app.main;

import java.util.Scanner;

//14. Даны два угла треугольника (в градусах). 
//Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. 

public class Task14Branch {
	
	public static void main(String [] args) {
		
		System.out.println("Введите два угла треугольника");
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c =  180 - a - b;
	
		
		if (a + b >= 180) {
			System.out.println("Треугольник не суще�?твует");
		} else if (a + b > 90 || a + c > 90 || b + c > 90) {
				System.out.println("Треугольник не существует");
		} else if (a + b == 90) {
				System.out.println("Треугольник существует и он прямоугольный");
		} else {
				System.out.println("Треугольник существует");
		}
	}
}