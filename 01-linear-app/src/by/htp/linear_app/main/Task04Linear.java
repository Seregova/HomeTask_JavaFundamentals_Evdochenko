package by.htp.linear_app.main;

import java.util.Scanner;

// 4. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c. 

public class Task04Linear {
	
	public static void main(String[] args) {
		
		System.out.println("Введите значение a, b, c");
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		
		double z = ((a -3) * b/2) + c;
				
		System.out.println("z = " + z);
	}

}
