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
		System.out.println("输入姓名");
		name = sc.next();
		System.out.println("输入课程编号");
		num = sc.next();
		
		System.out.println("输入四门课程的成绩");
		for (int i = 0; i < score.length; i++) {
			System.out.println("输入第"+(i+1)+"门课程的程序");
			score[i] = sc.nextInt();
		}
		sc.close();
	}

	public void showAlltheresult() {
		// TODO Auto-generated method stub
		System.out.println(name+" "+num);
		System.out.println("四门课程的程序：");
		int sum = 0;
		for (double i : score) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("总分："+sum);
		System.out.println("平均分："+sum/score.length);
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
