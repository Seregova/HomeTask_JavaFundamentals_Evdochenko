package by.htp.array_app.main;

import java.util.Random;
import java.util.Scanner;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.  

public class Task01Array {

	public static void main(String [] args) {
		
		int K = 3;
		int size = 5;
		int masA[] = new int[size];
		
		Random rand = new Random();
		
		for (int i = 0; i < masA.length; i++) {
			masA[i] = rand.nextInt(100);
		}
		
		for (int i = 0; i < masA.length; i++) {
			System.out.print(masA[i] + " ");
		}
		
		int sum = 0;
		for (int i = 0; i < masA.length; i++) {
			if (masA[i] % K == 0) {
				sum = sum + masA[i];
			} 
		}
		System.out.println("Сумма равна: " + sum);
	
	}
}
