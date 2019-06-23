package by.htp.linear_app.main;

import java.util.Scanner;

//20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью. 

public class Task20Linear {

	public static void main(String[] args) {

		System.out.println("Введите длину окружности L");
		
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		double R = L / (2 * Math.PI);
		double S = Math.PI * R * R;
		
		System.out.println("Радуис равен " + R);
		System.out.println("Площадь круга равна " + S);
		
	}
}