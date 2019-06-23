package by.htp.method_app.main;

import java.util.Scanner;

//9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми. 

public class Task09Method {
	
	public static void main(String [] args) {
		
		System.out.println("Введите 3 числа");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean primeA = primeNumber(a);
		boolean primeB = primeNumber(b);
		boolean primeC = primeNumber(c);
		
		System.out.println(primeA);
		System.out.println(primeB);
		System.out.println(primeC);
		
		if (primeA == true && primeB == true && primeC == true) {
			System.out.println("Числа простые");
		} else System.out.println("Одно или более чисел не являются простыми");
	}
	
	private static boolean primeNumber(int x) {
		
		boolean prime = true;
		
		if (x == 1) {
			prime = false;
		}
		
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				prime = false;	
			}
		}
		return prime;
		
	}

}
