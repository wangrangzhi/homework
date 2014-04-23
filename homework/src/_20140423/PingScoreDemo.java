package _20140423;

import java.util.Arrays;
import java.util.Scanner;

class PingScore
{
	double score[];
	Scanner sc = new Scanner(System.in);
	public PingScore()
	{
		System.out.println("输入评委数量");
		int num = sc.nextInt();
		score = new double[num];
	}
	
	public void InputScore()
	{
		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入第"+(i+1)+"个评委的分数");
			score[i] = sc.nextDouble();
			if(score[i]<7 || score[i]>10)
			{
				System.out.println("输入的成绩有误，请重新输入");
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
