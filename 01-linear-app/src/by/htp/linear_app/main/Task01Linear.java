package by.htp.linear_app.main;

import java.util.Scanner;

//1. Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частное.  

public class Task01Linear {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double sum = x + y;
		double sub = x - y;
		double div = x/y;
		double mul = x*y;
				
		System.out.println("sum = " +  sum + "; " + "sub = " + sub + "; " + "div = " + div + "; " + "mul = " + mul);
	}

}
