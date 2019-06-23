package by.htp.method_app.main;

import java.util.Arrays;
import java.util.Scanner;

//13. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N. 


public class Task13Method {
	
	public static void main(String [] agrs) {
	
		System.out.println("Введите число");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
		int newMas[] = intToArray(a);
		System.out.println(Arrays.toString(newMas));
	}
	
	private static int[] intToArray(int z) {
		int size = counter(z);
		int[] mas = new int[size];
		for (int i = 0; i < mas.length; i++) {
			mas[mas.length - 1 - i] = intToDigits(z, i);
		}
		return mas;
	}
	
	private static int counter(int b) {
		int c = 1;
		while (true) {
			b = b/10;
			if (b == 0) {
				break;
			} else {
				c++;
			}
		}
		return c;
	}

	private static int intToDigits(int a, int b) {
		int x = a%(int)(Math.pow (10, (b + 1)));
		int y = x/(int)(Math.pow (10, b));
		return y;
	}
}
