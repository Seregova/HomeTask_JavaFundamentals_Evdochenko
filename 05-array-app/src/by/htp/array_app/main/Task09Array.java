package by.htp.array_app.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы. 

public class Task09Array {

	public static void main(String [] args) {
		
		System.out.println("Введите размер массива N");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		int mas[] = new int[n];
		
		Random rand = new Random();
	
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		
		int newMas[] = changeIndexes(mas);
		System.out.println(Arrays.toString(newMas));
	}
	
	public static int[] changeIndexes(int[] mas1){
	   
		int max = mas1[0];
	    int min = mas1[0];
	    int maxIndex = 0;
	    int minIndex = 0;
	    
	    for(int i = 0; i < mas1.length; i++){
	        if (mas1[i] > max){
	            max = mas1[i];
	            maxIndex = i;
	        } 
	        if (mas1[i]< min) {
	            min = mas1[i];
	            minIndex = i;
	        }
	    }
	    mas1[maxIndex] = min;
	    mas1[minIndex] = max;
	    
	    return mas1;
	
	}
}
