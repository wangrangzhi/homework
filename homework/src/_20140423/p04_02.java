package _20140423;

import java.util.Scanner;

class Getday
{
	int year;
	int month;
	int day;
	public Getday(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;

	}
	
	public int getthenum()
	{
		int [] a = {31,28,31,30,31,30,31,31,30,31,30,31};
		int sum = 0;
		if(year%4==0 && year%100!=0 ||year%400 == 0)
			a[1] = 29;
		
		for (int i = 0; i < a.length-1; i++) {
			sum +=a[i];
		}
		return sum+=day;
	}
	
}

public class p04_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		
		Getday g = new Getday(year, month, day);
		System.out.println(g.getthenum());
	}

	
}
