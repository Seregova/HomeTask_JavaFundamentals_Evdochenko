package by.htp.linear_app.main;

import java.util.Scanner;

//22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
//Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc

public class Task22Linear {
	
	public static void main(String[] args) {
		
			System.out.println("Введите введите время в секундах");
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int HH = T / 3600;
		int secondsLeft = T % 3600;
		int MM = secondsLeft / 60;
		int SS = secondsLeft % 60;
		
		System.out.println(HH + ":" + MM + ":" + SS);
	}
}
