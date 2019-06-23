package by.htp.branch_app.main;

import java.util.Scanner;

// 5. Составить программу: определения наименьшего из двух чисел а и b. 

public class Task05Branch {
	
	public static void main(String [] args) {
		
		System.out.println("Введите a и b");
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		if (a<b) {
			System.out.println("Меньшее число " + a);
		}  else if (a>b) {
			System.out.println("Меньшее число " + b);
		} else  {
			System.out.println("Числа равны");
			}
	}
}
