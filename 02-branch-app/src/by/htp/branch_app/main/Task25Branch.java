package by.htp.branch_app.main;

import java.util.Scanner;

//25. Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация »,
//если температура в комнате превысила 60° С. 

public class Task25Branch {
	
	public static void main(String [] args) {
		
		System.out.println("Введите температуру датчика");
	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x>=60) {
			System.out.println("Пожароопасная ситуация");
		} else  {
			System.out.println("Опасности нет, но соблюдайте правила пожарной безопасности");
		}
	}
}
