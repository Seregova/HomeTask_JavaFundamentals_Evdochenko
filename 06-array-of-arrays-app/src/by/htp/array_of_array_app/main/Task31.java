package by.htp.arrayofarray.main;

//31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней. 

public class Task31 {
	
	public static void main(String[] args) {
		
		int[][] array = new int[10][100];
	
		int count = 0;
		
		for (int i = 0; i < 10; i++) { 
			for (int j = 0; j < 100; j++) {
				int value = i*100+j; 
				array[i][j] = value;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int value = array[i][j];	
				if (value> 9 && value <100){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}