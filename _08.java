

import java.util.Calendar;
import java.util.Scanner;

public class _08 {

	
	public static void main(String[] args) {
		int y,m,d;
		System.out.println("input the year, month, and days");
		Scanner s=new Scanner(System.in);
		y=s.nextInt();
		m=s.nextInt();
		d=s.nextInt();
		int kyo = d;



				switch (m) {
					  case 12:
					   kyo =+ 31;
					   
					  case 11:
					    kyo =+ 30;
					   
					  case 10:
					   kyo =+ 31;
					   
					  case 9:
					   kyo =+ 30;
					  
					  case 8:
					   kyo=+ 31;
					   
					  case 7:
					   kyo=+ 30;
					   
					  case 6:
					   kyo =+ 31;
					   
					  case 5:
					   kyo =+ 31;
					   
					  case 4:
					   kyo =+ 30;
					   
					  case 3:
					   kyo =+ 31;
					   
					  case 2:
					  

					    if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
					    kyo =+ 29;
					   else
					    kyo =+ 28;
					   
					   
					  case 1:
					   kyo =+ 31;
					   }



					   System.out.println("It's the "+kyo+"th days of the year");


	}

}
