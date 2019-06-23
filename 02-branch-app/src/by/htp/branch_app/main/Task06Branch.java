package by.htp.branch_app.main;

import java.util.Scanner;

//6. Составить программу: определения наибольшего из двух чисел а и b. 

public class Task06Branch {

	public static void main(String [] args) {
		
		System.out.println("Введите a и b");
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		if (a>b) {
			System.out.println("Большее чи�?ло " + a);
		}  else if (a<b) {
			System.out.println("Большее чи�?ло " + b);
		} else  {
			System.out.println("Чи�?ла равны");
		}
	}
}
