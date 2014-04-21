import java.util.Scanner;

public class _10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("the mail:");
		
			int n =new Scanner(System.in).nextInt();
			float m1=10,m2=8;
			if(n>3){
				m1+=(n-3)*2f;
				m2+=(n-3)*2.2f;
			}
			System.out.println("the first:"+m1+"\tthe second "+m2);
		
	}

}
