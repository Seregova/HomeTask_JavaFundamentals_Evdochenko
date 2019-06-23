package by.htp.linear_app.main;

import java.util.Scanner;

//33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы. 

public class Task33Linear {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);

		char x =(char)(a - 1);
		char y =(char)(a + 1);
		
		
		System.out.println(a + " " + x + " " + y);
	}

}
