package by.htp.arrayofarray.main;

//38. Найдите сумму двух матриц 

import java.util.Random;

public class Task38 {
	
public static void main(String[] args) {
		
		int[][] array1 = new int[4][4];
		int[][] array2 = new int[4][4];
		int[][] sum = new int[4][4];
		
		Random rand = new Random();

		System.out.println("First matrix");
		for (int i = 0; i < 4; i++) { 
			for (int j = 0; j < 4; j++) {
				int value = rand.nextInt(20); {
					array1[i][j] = value;
					System.out.print(array1[i][j] + "\t");
				}
			} 	
			System.out.println();
		}
		
		System.out.println("Second matrix");
		for (int i = 0; i < 4; i++) { 
			for (int j = 0; j < 4; j++) {
				int value = rand.nextInt(20); {
					array2[i][j] = value;
					System.out.print(array2[i][j] + "\t");
				}
			} 	
			System.out.println();
		}
		
		System.out.println("Sum of matrixes");
		for(int i = 0; i < 4; i++) {
			 for(int j = 0; j < 4; j++) {
				 sum[i][j] = array1[i][j] + array2[i][j];
				 System.out.print(sum[i][j]+ "\t");
			 }
			 System.out.println();
		}
	}
}
