package by.htp.arrayofarray.main;

import java.util.Random;

//30. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
//Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз. 


public class Task30 {
	
	public static void main(String[] args) {
		
		int[][] array = new int[10][20];
		
		int[] arrayfive = new int[10];
		
		Random rand = new Random();

		for (int i = 0; i < 10; i++) { 
			for (int j = 0; j < 20; j++) {
				int value = rand.nextInt(16);{
					array[i][j] = value;
					if (value == 5) {
						arrayfive[i]++;
					}
					System.out.print(array[i][j] + "\t");
				}
			} 	
			System.out.println();
		}
		for (int i = 0; i <arrayfive.length; i++) {
			if (arrayfive[i] >= 3) {
				System.out.println("Line with more than three fives: " + i);
			}
		}
	}
}

