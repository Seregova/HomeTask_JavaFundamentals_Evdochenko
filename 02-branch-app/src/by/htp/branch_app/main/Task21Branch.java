package by.htp.branch_app.main;

import java.util.Scanner;

//21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 
//В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!». 


public class Task21Branch {
	
	public static void main(String [] args) {
		
	System.out.println("Кто ты: мальчик или девочка? Введи B или G");
	
	Scanner sc = new Scanner(System.in);

	char X = sc.next().charAt(0);

	
		if (X == 'B' || X == 'b') {
				System.out.println("Мне нравятся мальчики!");
		} else if (X == 'G'|| X == 'g')	{
				System.out.println("Мне нравятся девочки!");
		} else {
				System.out.println("Неопозанный объект");
		}
		
	}
}