package by.htp.branch_app.main;

import java.util.Scanner;

//23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
//Если введены некорректные данные, то сообщить об этом. 

public class Task23Branch {

	public static void main(String [] args) {
		
		System.out.println("Введите число и месяц");
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int month = sc.nextInt();
		
			if (0 > day || day > 31 || 0 > month || month > 12){
				System.out.println("Дата введена некорректно");	
			} else if (0 < day && day <= 31 && 0 < month && month <= 12){
				System.out.println("Дата введена корректно: " + day + "." + month);
			}
			
		}
}

