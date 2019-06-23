package by.htp.linear_app.main;

import java.util.Scanner;

//3. Найдите  значение функции: z = 2 * x + ( y – 2 ) * 5. 


public class Task03Linear {
	
	public static void main(String[] args) {
		
		System.out.println("Введите значение x, y");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int z = 2 * x + (y - 2) * 5;
		
		System.out.println("z = " + z);
		
	}
	
}
