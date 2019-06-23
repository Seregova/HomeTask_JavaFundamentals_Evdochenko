package by.htp.branch_app.main;

import java.util.Scanner;

// 3. Составить программу сравнения введенного числа а и цифры 3. 
// Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no». 

public class Task03Branch {
	
	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a<3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}