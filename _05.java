import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		System.out.println("input an al:");
		
			String s =new Scanner(System.in).nextLine();
			String []data=s.split("[\\+\\-\\*\\/]");
			float n1=Float.parseFloat(data[0]);
			float n2=Float.parseFloat(data[1]);
			float sum=0;
			if(s.contains("+")){
				sum=n1+n2;
			}else if(s.contains("-")){
				sum=n1-n2;
			}else if(s.contains("*")){
				sum=n1*n2;
			}else if(s.contains("/")){
				sum=n1/n2;
			}
			System.out.println("result:"+sum);
		

	}

}
