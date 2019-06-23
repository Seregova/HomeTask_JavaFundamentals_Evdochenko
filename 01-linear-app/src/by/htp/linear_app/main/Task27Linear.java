package by.htp.linear_app.main;

import java.util.Scanner;

//27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, 
//получить значение а8 за три операции и  а10 за четыре операции.

public class Task27Linear {

	public static void main(String [] args) {
		
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			int a2 = a*a;
			int a4 = a2 *a2;
			int a8 = a4 * a4;
			int a10 = a8 * a2;
			
			System.out.println(a8 +" " + a10);
			
	}
}
