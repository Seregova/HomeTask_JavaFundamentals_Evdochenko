package by.htp.linear_app.main;

import java.util.Scanner;

//8. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏 + √𝑏2 + 4𝑎𝑐 2𝑎 − 𝑎3𝑐 + 𝑏−2 

public class Task08Linear {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double z = (b + Math.sqrt(b*b + 4* a* c) ) /(2 * a) - a * a * a *c + Math.pow(b, -2);
				
		System.out.println("Ответ: " + z);
	}
}
