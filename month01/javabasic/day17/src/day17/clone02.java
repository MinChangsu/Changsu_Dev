package day17;
class Rectangle implements Cloneable{
	private Point2 upperleft;
	private Point2 lowerright;
	public Rectangle(int x1,int y1,int x2,int y2) {
		upperleft =new Point2(x1,y1);
		lowerright =new Point2(x2,y2);
	}
	@Override
	protected Rectangle clone() throws CloneNotSupportedException {
		Rectangle copy=(Rectangle)super.clone();
		copy.upperleft =(Point2)upperleft.clone();
		copy.lowerright =(Point2)lowerright.clone();
		
		
		return copy;
		
		
	}
	
	}
class Point2 implements Cloneable{
	private int xpos;
	private int ypos;
Point2(int x, int y){
	xpos=x;
	ypos=y;
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


}
public class clone02 {

	public static void main(String[] args) {
		Rectangle org=new Rectangle(1,1,9,9);
		Rectangle cpy;
		try {
			cpy=org.clone();
			
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
