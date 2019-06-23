package by.htp.method_app.main;

//14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр. 

import java.util.Scanner;

public class Task14Method {
	
	public static void main(String [] args) {
		
		System.out.println("Введите 2 числа");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = countDigit(a);
		int y = countDigit(b);
		
		if (x>y) {
			System.out.println("В первом числе больше цифр");
		}
		if (x<y) {
			System.out.println("Во втором числе больше цифр");
		}	
		else if (x == y) {
			System.out.println("Количество цифр равное");
		}
	}

	private static int countDigit(int c) {
			int d = 1;
			while (true) {
				c = c/10;
				if (c == 0) {
					break;
				} else {
					d++;
				}
			}
			return d;
	}
	
}
