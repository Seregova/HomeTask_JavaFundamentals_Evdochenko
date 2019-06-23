package by.htp.cycle_app.main;

import java.util.Scanner;

//6. Напишите программу, где пользователь вводит любое целое положительное число.
//А программа суммирует все числа от 1 до введенного пользователем числа. 

public class Task06Cycle {
	
	public static void main(String[] args){
		
		System.out.println("Введите положительное число");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= x; i++) {
			sum = sum + i;
		} 
		System.out.println(sum);
	}
}
