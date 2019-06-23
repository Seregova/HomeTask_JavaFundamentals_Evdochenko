package by.htp.linear_app.main;

import java.util.Scanner;

// 2. Найдите  значение функции: с = 3 + а. 

public class Task02Linear {
	
	public static void main(String [] args) {
		
		System.out.println("Введите значениe a");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int c = 3 + a;
		
		System.out.println("c = " + c);
				
	}

}
