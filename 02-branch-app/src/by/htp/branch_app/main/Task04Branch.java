package by.htp.branch_app.main;

import java.util.Scanner;

//4. Составить программу:  равны ли два числа а и b? 

public class Task04Branch {
	
	public static void main(String [] args) {
		
		System.out.println("Введите два числа");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a==b) {
			System.out.println("Числа равны");
		} else {
			System.out.println("Числа не равны");
		}
	}
}