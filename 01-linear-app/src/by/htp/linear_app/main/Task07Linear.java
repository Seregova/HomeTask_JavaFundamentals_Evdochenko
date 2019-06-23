package by.htp.linear_app.main;

import java.util.Scanner;

//7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника 

public class Task07Linear {
	
	public static void main(String [] args) {
		
		System.out.println("Введите ширину прямоугольника:");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x *2;
		
		int s = x * y;
		
		System.out.println("Площадь прямоугольника = " + s);
	}
}
