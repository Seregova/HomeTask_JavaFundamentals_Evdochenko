package by.htp.arrayofarray.main;

// 40.Магическим квадратом порядка n называется квадратная матрица размера nxn, 
//составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу, 
// каждой строке и каждой из двух больших диагоналей равны между собой. 

import java.util.Random;
import java.util.Scanner;

public class Task40 {
	
	 public static void main(String [] args) {
		 
		 System.out.println("Введите размер матрицы");
		 
		 Scanner sc = new Scanner(System.in);
		 int size = sc.nextInt(); 
		 
		 int [][] array = createArray(size, size);
	  
		 displayArray(array);
		 if(isMagicSquare(array))
			 System.out.println("Магический квадрат!");
		 else
			 System.out.println("Не магический квадрат");
	 }
	
	 
	 private static int [][] createArray(int rows, int columns){
		 
		 int [][] array = new int [rows][columns];
		 for(int i = 0; i < rows; i++)
			 for(int j = 0; j < columns; j++)
				 array [i][j] = new Random().nextInt(10);
		 return array;
	 }
	
	 private static void displayArray(int [][] array){
		 
		 for(int i = 0; i < array.length; i++){
			 for(int j = 0; j < array [i].length; j++)
				 System.out.print(array [i][j] + " ");
			 System.out.println();
		 }
		 System.out.println();
	 }
	 
	 private static int sumInRow(int row, int [][] array){
		 int sum = 0;
		 for(int i = 0; i < array.length; i++){
			 for(int j = 0; j < array [i].length; j++){
				 if(i == row)
					 sum += array [i][j];
				 }
		 }
		 return sum;
	 }
	 
	 private static int sumInColumn(int column, int [][] array){
		 
		 int sum = 0;
		 for(int i = 0; i < array.length; i++){
			 for(int j = 0; j < array [i].length; j++)
				 if(j == column)
					 sum += array [i][j];
		 }
		 return sum;
	 }
	 
	 private static int sumInLeftDiag(int [][] array){
		 
		 int sum = 0;
		 for(int i = 0; i < array.length; i++)
			 sum += array [i][i];
		 return sum;
	 }
	 
	 private static int sumInRightDiag(int [][] array){
		 
		 int sum = 0;
		 for(int i = 0, j = array [i].length - 1;
				 i < array.length && j >= 0; i++, j--)
			 sum += array [i][j];
		 return sum;
	 }
	 
	 private static boolean isMagicSquare(int [][] array){
		 
		 boolean b = false;
		 int sum = sumInRow(0, array);
		 for(int i = 0; i < array.length; i++){
			 if(sumInRow(i, array) == sum && sumInColumn(i, array) == sum &&
					 sumInLeftDiag(array) == sum && sumInRightDiag(array) == sum)
				 b = true;
		 }
		 return b;
	 }
	}