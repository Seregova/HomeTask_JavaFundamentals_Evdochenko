package by.htp.arrayofarray.main;

//1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, 
//чтобы в одной строке была ровно одна единица, и вывести на экран.

public class Task01 {
	
	public static void main(String[] args) {
		
		int[][] array = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}};
	  
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j< 4; j++) {
			System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}