package _20140423;

class Area
{
	int height;
	int width;
	public Area(int height, int width)
	{
		this.height = height;
		this.width = width;
		
	}
	
	public int getArea()
	{
		if(height == width)
		{
			System.out.println("���Ǹ�������");
		}else
		{
			System.out.println("����������");
		}
		
		return height*width;
	}
}

public class p4_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area = new Area(12, 13); 
		Area area1 = new Area(12, 12);
		System.out.println(area.getArea());
		System.out.println(area1.getArea());

	}

}
