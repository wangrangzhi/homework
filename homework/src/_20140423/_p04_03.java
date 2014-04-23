package _20140423;
import javax.swing.JOptionPane;

class Student
{
	String name;
	int age;
	public Student (int i)
	{
		name = JOptionPane.showInputDialog("请输入第"+i+"个同学的姓名：");
		age = Integer.parseInt(JOptionPane.showInputDialog("请输入第"+i+"个同学的age："));
	}
	
	public void showinfo()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
	
	public int getAge()
	{
		return age;
	}
}

public class _p04_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student [] stu = new Student [5];
		
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student(i+1);
		}
		
		for (int i = 1; i < stu.length; i++) {
			stu[i].showinfo();
		}
		int sum = 0;
		for (int i = 0; i < stu.length; i++) {
			sum+=stu[i].getAge();
		}
		sum/=5;
		
		System.out.println(sum);
		
	}

}
