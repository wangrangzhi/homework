package _20140424;

import java.util.Scanner;

class numSum
{
	int num;
	
	public int Sum(int num) {
		int number = 0;
		
		if(num<10)
		{
			System.out.println(num);
			return num;
		}else 
		{
			do
			{
				number += num%10;
				
				num = num/10;
				
		//		System.out.println(number+"    "+num);
				
			}while(num >= 10 );
			
			number +=num;
			
			return number;
			
			
		}
		
		
		
		
		
		
	}
}


public class p0706 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
	
		
		numSum ns = new numSum();
		
		
		do
		{
			num = ns.Sum(num);
			
		}while(num>10);
		
		
		System.out.println(num);
		
		sc.close();

	}

	

}
