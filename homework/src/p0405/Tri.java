package p0405;

public class Tri extends Area{

	@Override
	public void area1() {
		// TODO Auto-generated method stub
		
		int p = (3*r)/2;
		System.out.println("�����ε�����ǣ�"+Math.sqrt(p*(p-r)*(p-r)*(p-r)));
	}

}
