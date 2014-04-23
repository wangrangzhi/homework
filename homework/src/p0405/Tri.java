package p0405;

public class Tri extends Area{

	@Override
	public void area1() {
		// TODO Auto-generated method stub
		
		int p = (3*r)/2;
		System.out.println("三角形的面积是："+Math.sqrt(p*(p-r)*(p-r)*(p-r)));
	}

}
