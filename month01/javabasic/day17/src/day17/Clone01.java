package day17;
class Point1 implements Cloneable{
	private int xpos;
	private int ypos;
	
	public Point1(int x,int y) {
		xpos=x;
		ypos=y;
	}
	public void showPositon() {
		System.out.printf("[%d,%d]",xpos ,ypos);
		System.out.println();
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class Clone01 {

	public static void main(String[] args) {
		Point1 org = new Point1(3,5);
		Point1 cpy;
		try {
			cpy=(Point1)org.clone();
			org.showPositon();
			cpy.showPositon();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		

	}

}
