package by.htp.linear_app.main;

//25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с 
//(предполагается, что а≠0 и что дискриминант уравнения неотрицателен). 

import java.util.Scanner;

public class Task25Linear {
	
	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        double D = dis(a, b, c);

	        if (D > 0) {
	            double x1, x2;
	            x1 = (-b - Math.sqrt(D)) / (2 * a);
	            x2 = (-b + Math.sqrt(D)) / (2 * a);
	            System.out.println(x1 + " " + x2);
	        } else if (D == 0) {
	            double x;
	            x = (-b / 2 * a);
	            System.out.println(x);
	        } else {
	            System.out.println("Отрицательный дискриминант");
	        }
	    }
	 
	    public static double dis(int i, int j, int k) {
	        double dis = (double) (j * j - 4 * i * k);
	        return dis;
	  }

}
