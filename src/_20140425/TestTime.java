package _20140425;

public class TestTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Plane p = new Plane();
		double pv = p.speed(13, 56,34);
		new ComputerTime(pv);
		
		Car007 c = new Car007();
		double cv = c.speed(13, 56,34);
		new ComputerTime(cv);
		
		
	}

}
