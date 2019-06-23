package by.htp.method_app.main;

import java.util.Scanner;

//5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел. 

public class Task05Method {
		
	public static void main(String [] args) {
	
			System.out.println("Введите 3 числа");
	
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
	
			int max = maxInteger(a, b, c);
			int min = minInteger(a, b, c);
			
			int sum = max + min;
			System.out.println(sum);
		}
	
	private static int maxInteger(int x, int y, int z) {
		int max1 = Math.max(x, y);
		int max2 = Math.max(max1,z);
		
		return max2;
	}
	
	private static int minInteger(int x, int y, int z) {
		int min1 = Math.min(x, y);
		int min2 = Math.min(min1,z);
        return min2;
        
	}
}
