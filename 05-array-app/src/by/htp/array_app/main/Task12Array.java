package by.htp.array_app.main;

import java.util.Random;
import java.util.Scanner;

//12. Задана последовательность N вещественных чисел. 
//Вычислить сумму чисел, порядковые номера которых являются простыми числами. 

public class Task12Array {
	
	public static void main(String [] args) {
	
		System.out.println("Введите размер массива N");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		double mas[] = new double[n];
		
		Random rand = new Random();
	
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble() * 10;
		}
	
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		
		double sum = 0;
		for (int i = 0; i < mas.length; i++) {
			if (isPrime(i)) {
				sum = sum + mas[i];
			} 
		}
		System.out.print(sum);
	}
	
	public static boolean isPrime(int a) {
		boolean prime = true;
		
		if (a == 1 || a == 0) {
			prime = false;
		}
		
		for (int ii = 2; ii < a; ii++) {
			if (a % ii == 0) {
				prime = false;	
			}
		}
		return prime;
		
	}
	
}
