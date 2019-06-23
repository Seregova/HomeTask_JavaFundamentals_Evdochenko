package by.htp.linear_app.main;

//16. Найти произведение цифр заданного четырехзначного числа. 

import java.util.Scanner;

public class Task16Linear {
	
	public static void main(String [] args) {
		
		while (true) {
			
			System.out.println("Введите четырехзначное число");
		
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			if (a > 999 & a <9999) {
				
				int a1 = a/1000; 
				int a2 = a%1000/100;
				int a3 = a%100/10;
				int a4 = a%10;
				
				int sum = a1 * a2 * a3 *a4;
				
				System.out.println(sum);
				break;
				
			} else {
				System.out.println("Вы ввели не четырехзначное число");
			}
		}	
		
	}
}
