package by.htp.branch_app.main;

import java.util.Scanner;

//34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
//Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, 
//печатает на экране «спасибо»; если денег внесено больше, чем необходимо, 
//то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, 
//то печатает сообщение об этом и указывает размер недостающей суммы. 


public class Task34Branch {
	
	public static void main(String[] args){
		
		System.out.println("Введите стоимость книги и сумму денег");
		
		Scanner sc = new Scanner(System.in);
		double bookPrice = sc.nextDouble();
		double money = sc.nextDouble();
		
		double changeToCustomer = money - bookPrice;
		
				if (changeToCustomer == 0) {
						System.out.println("Спасибо");
				} else if (changeToCustomer > 0.0 ) {
						System.out.println("Возьмите сдачу: " + changeToCustomer );
				} else if (changeToCustomer < 0.0 ) {
					System.out.println("недостает еще: " + Math.abs(-changeToCustomer));			
				}
	}
}