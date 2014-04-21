

import java.util.Arrays;
import java.util.Scanner;

public class _07 {

	
	public static void main(String[] args) {
		System.out.println("input the three numbers:");
		int arr[]=new int[3];
		
			Scanner s=new Scanner(System.in);
			arr[0]=s.nextInt();
			arr[1]=s.nextInt();
			arr[2]=s.nextInt();
			Arrays.sort(arr);
			System.out.println("the max is: "+arr[2]);
		
		
	}

}
