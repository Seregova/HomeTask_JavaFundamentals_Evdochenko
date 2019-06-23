package by.htp.arrayofarray.main;

import java.util.Random;

//2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].

public class Task02 {
	
	public static void main(String[] args) {
		
		int[][] array = new int[2][3];
		
		Random rand = new Random();

		for (int i = 0; i < 2; i++) { 
			for (int j = 0; j < 3; j++) {
				int value = rand.nextInt(10); {
					array[i][j] = value;
					System.out.print(array[i][j] + "\t");
				}
			} 	
			System.out.println();
		}
	}
}
