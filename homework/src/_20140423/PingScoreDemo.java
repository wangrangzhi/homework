package _20140423;

import java.util.Arrays;
import java.util.Scanner;

class PingScore
{
	double score[];
	Scanner sc = new Scanner(System.in);
	public PingScore()
	{
		System.out.println("������ί����");
		int num = sc.nextInt();
		score = new double[num];
	}
	
	public void InputScore()
	{
		for (int i = 0; i < score.length; i++) {
			System.out.println("�������"+(i+1)+"����ί�ķ���");
			score[i] = sc.nextDouble();
			if(score[i]<7 || score[i]>10)
			{
				System.out.println("����ĳɼ���������������");
				i--;
			}
		}
	}

	public void showResult() {
		// TODO Auto-generated method stub
		Arrays.sort(score);
		
		double sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		sum /=score.length;
		System.out.println(sum);
		
	}

	public void showAllscore() {
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}

public class PingScoreDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PingScore pingscore = new PingScore();
		pingscore.InputScore();
		pingscore.showAllscore();
		pingscore.showResult();
	}

}
