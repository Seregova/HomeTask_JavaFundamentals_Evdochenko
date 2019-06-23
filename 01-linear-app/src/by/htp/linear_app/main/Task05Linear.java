package by.htp.linear_app.main;

import java.util.Scanner;

//5. Составить алгоритм нахождения среднего арифметического двух чисел 

public class Task05Linear {
		
	public static void main(String[] args) {
		
			System.out.println("Введите значение x, y");
		
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			double z =  (double)(x + y) / 2;
			
			System.out.println("Среднее арифметичеcкое = " + z);
	}
		
}