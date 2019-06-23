package by.htp.branch_app.main;

import java.util.Scanner;

//9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним. 

public class Task09Branch {

	public static void main(String [] args) {
		
		System.out.println("Введите три стороны треугольника");
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a==b && b==c) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник неравносторонний");
		}
			
	}
}
