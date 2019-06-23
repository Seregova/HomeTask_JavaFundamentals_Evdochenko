package by.htp.branch_app.main;

import java.util.Scanner;

//24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», 
//взяв за исходное данное количество лепестков п. 


public class Task24Branch {
	
	public static void main(String [] args) {
		
		System.out.println("Введите количество лепестков");
		
		Scanner sc = new Scanner(System.in);
		
		int petalNumber = sc.nextInt();
		
			if ((petalNumber % 2)==0) {
					System.out.println("НЕ ЛЮБИТ");
			}else {
					System.out.println("ЛЮБИТ!");
			}
	}
}
