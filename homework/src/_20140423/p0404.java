package _20140423;

import java.util.Scanner;

class StuInfo
{

	String name;
	String num;
	double [] score = new double[4];
	
	

	public void inPutscore() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		name = sc.next();
		System.out.println("����γ̱��");
		num = sc.next();
		
		System.out.println("�������ſγ̵ĳɼ�");
		for (int i = 0; i < score.length; i++) {
			System.out.println("�����"+(i+1)+"�ſγ̵ĳ���");
			score[i] = sc.nextInt();
		}
		sc.close();
	}

	public void showAlltheresult() {
		// TODO Auto-generated method stub
		System.out.println(name+" "+num);
		System.out.println("���ſγ̵ĳ���");
		int sum = 0;
		for (double i : score) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("�ܷ֣�"+sum);
		System.out.println("ƽ���֣�"+sum/score.length);
	}
	
}

public class p0404 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StuInfo stu = new StuInfo();
		
		stu.inPutscore();
		stu.showAlltheresult();
	}

}
