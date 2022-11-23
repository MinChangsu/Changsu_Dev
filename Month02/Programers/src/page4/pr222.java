package page4;

class Box<T extends Number>{
	public boolean isint(T n) {
		try {Integer.parseInt(String.valueOf(n));
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
		}
	public int plus(T num) {
		return num.intValue()+1;
	}
	public T plus(T n1,T n2) {
		if(isint(n1)) {
			Number int1=(Number)(n1.intValue()+n2.intValue());
			return (T) int1;
			
	}
		else {
			Number dou1=(Number)(n1.doubleValue()+n2.doubleValue());
			return (T) dou1;
		}
	
	} 

}

	



public class pr222 {

	public static void main(String[] args) {
		Box a=new Box();
		
		System.out.println(a.plus(1,2));
		System.out.println(a.plus(1.1,2.4));
		

	}

}
