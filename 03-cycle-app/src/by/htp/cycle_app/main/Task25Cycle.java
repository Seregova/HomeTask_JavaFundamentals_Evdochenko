package by.htp.cycle_app.main;

import java.util.Scanner;

//25. Требуется определить факториал числа, которое ввел пользователь.

public class Task25Cycle {
	
	public static void main(String[] args){
		
		System.out.println("Введите число");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int fact = 1;
		
		for (int i = 1; i <= a; i++) {    
		     fact = fact * i;  
		}    
		
		System.out.println(fact);
	}

}