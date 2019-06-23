package by.htp.linear_app.main;

import java.util.Scanner;

// 6. Написать код для решения задачи. В n малых бидонах 80 л молока. 
//Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?

public class Task06Linear {
	
	public static void main(String[] args) {

		System.out.println("Введите количество малых и больших бидонов");
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		double x = 80.0 / (double) n;
		double y = x + 12.0;
		double lit = y * (double)(m);
	
		System.out.println(lit + " литров в больших бидонах");
	}
	
}