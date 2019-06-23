package by.htp.branch_app.main;

import java.util.Scanner;

// 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.  

public class Task08Branch {
	
	public static void main(String [] args) {
		
		System.out.println("Введите a и b");
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = a * a;
		int y = b * b;
	
		if (x<y) {
			System.out.println("Наименьший квадрат из двух чисел " + x);
		}  else if (x>y) {
			System.out.println("Наименьший квадрат из двух чисел " + y);
		} else  {
			System.out.println("Квадраты равны");
		}
	}
}

