package by.htp.branch_app.main;

import java.util.Scanner;

//33. Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных. 
//Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. 
//Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С. 


public class Task33Branch {
	
	public static void main(String[] args){
	
	System.out.println("Введите пароль");
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();

		if (a == 9583 || a == 1747) {
				System.out.println("Доступ открыт к модулям A B C");
		} else if 	(a == 3331 || a == 7922){
				System.out.println("Доступ открыт к модулям B C");
		} else if 	(a == 9455 || a == 8997){
				System.out.println("Доступ открыт к модулю C");
		} else System.out.println("Доступ закрыт");
		
	}
}
