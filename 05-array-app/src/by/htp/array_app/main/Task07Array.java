package by.htp.array_app.main;

import java.util.Random;
import java.util.Scanner;

//7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен. 

public class Task07Array {
	
	public static void main(String [] args) {
	
		System.out.println("Введите размер массива n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Введите число Z");
		int z = sc.nextInt();
		
		int count = 0;
	
		int mas[] = new int[n];
	
		Random rand = new Random();
	
		for (int i = 0; i < mas.length; i++) {
		mas[i] = rand.nextInt(1000);
		}
		
		System.out.println("Массив данных до замены: ");
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		
		System.out.println('\n' + "Массив данных после замены: ");
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < z) {
				mas[i] = z;
				count++;
			}
			System.out.print(mas[i] + " ");
		}
		
		System.out.println('\n' + "Количество замен: " + count );
	}
}
