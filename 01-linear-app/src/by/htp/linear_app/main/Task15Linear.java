package by.htp.linear_app.main;

import java.util.Scanner;

//15. Написать программу, которая выводит на экран первые четыре степени числа π. 

public class Task15Linear {

	public static void main(String [] args) {
			
		double pi = Math.PI;
		double pi2 = pi * pi;
		double pi3 = pi2 * pi;
		double pi4 = pi3 * pi;
		
		System.out.println(pi + " " + pi2 + " " + pi3 + " " + pi4);
}
}