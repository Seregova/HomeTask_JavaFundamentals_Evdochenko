package by.htp.array_app.main;

import java.util.Random;
import java.util.Scanner;

//10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.  


public class Task10Array {
	
	public static void main(String [] args) {
		
		
		System.out.println("Введите размер массива n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int mas[] = new int[n];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(20);
		}
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	
		System.out.println("\n" + "Числа, которые больше своих индексов: ");
		
		for (int i = 0; i < mas.length; i++) {
			if (i < mas[i]) {
			System.out.print( mas[i] + " ");	
			}
		}
	}
}
