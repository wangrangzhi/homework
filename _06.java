

import java.util.Scanner;

public class _06 {

	/**
	 * @param args
	 * 计算 ax2 + bx +c=0的根
	 */
	public static void main(String[] args) {
		System.out.println("input the number:");
		
			float a,b,c;
			Scanner s =new Scanner(System.in);
			a=s.nextFloat();
			b=s.nextFloat();
			c=s.nextFloat();
			float dt =b*b-4*a*c;
			if(dt<0){
				System.out.println("no result");
			}else {
				float x1=(float) (-b+Math.sqrt(dt)/(2*a));
				float x2=(float) (-b-Math.sqrt(dt)/(2*a));
				System.out.println("x1="+x1+", x2="+x2);
			}
			
		
		
	}

}
