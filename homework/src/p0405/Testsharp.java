package p0405;

public class Testsharp {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Area[] a = new Area[4];
		String[] name = {"Bool", "Cricle", "Tri", "Zhengfang"};
		
		for (int i = 0; i < name.length; i++) {
			a[i] = (Area) Class.forName("p0405."+name[i]).newInstance();
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i].area1();
		}
	}

}
