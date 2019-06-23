package by.htp.linear_app.main;

import java.util.Scanner;

//28. Составить программу перевода радианной меры угла в градусы, минуты и секунды. 

public class Task28Linear {
	
	public static void main(String [] args) {
		
		System.out.println("Введите радианную меру угла");
		Scanner sc = new Scanner(System.in);
		double rad = sc.nextDouble();
		
		double degree = rad * 180 / Math.PI ;
		
		int seconds = (int)(rad *180 / Math.PI * 3600);
		
		int intDegree = seconds / 3600;
		
		int degreeLeft = seconds % 3600; 
		
		int minutes = degreeLeft /60; 
		
		int secondsLeft = degreeLeft %60;
		
		
		System.out.println("Мера угла в градусах равна = " + degree);
		System.out.println("Мера угла в градусах, минутах и �?екундах равна = " + intDegree + " " + minutes + " " + secondsLeft);
	}
}
