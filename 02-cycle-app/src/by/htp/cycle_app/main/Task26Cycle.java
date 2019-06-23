package by.htp.cycle_app.main;

//26. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII). 

public class Task26Cycle {
	
	public static void main(String[] args){
		
		for (int i = 0; i <= 255; i++) {
			System.out.println("Числу " + i + " соответствует символ " + (char)i);
		}
	}
}
