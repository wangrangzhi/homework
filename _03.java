
import java.util.Scanner;

public class _03 {

	
	public static void main(String[] args) {
		System.out.println("input a float");
		
		
			String s = new Scanner(System.in).nextLine();
			String s1=s.substring(0, s.indexOf("."));
			String s2=s.substring(s.indexOf(".")+1, s.length());
			System.out.println("the biger is"+s1+" the small is"+s2);




			
		
	}

}
