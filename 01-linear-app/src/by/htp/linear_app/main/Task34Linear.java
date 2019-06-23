package by.htp.linear_app.main;

//34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации. 


public class Task34Linear {
	
	public static void main(String[] args) {


		long A = 10000000000L;
		System.out.println(A);
		
		double kb = A/1024;
		double mb = kb/1024;
		double gb = mb/1024;
		double tb = gb/1024;
		
		System.out.println(kb + " " + mb + " " + gb + " " + tb);
				
	}
}

//Вариант 2й
		//double AD = 100000000000000000.1;
		
		//System.out.println(AD);
		
		//double dkb = A/1024;
		//double dmb = kb/1024;
		//double dgb = mb/1024;
		//double dtb = gb/1024;
		
		//System.out.println(dkb + " " + dmb + " " + dgb + " " + dtb);