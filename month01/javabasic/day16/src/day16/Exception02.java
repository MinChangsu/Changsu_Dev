package day16;

public class Exception02 {
	public static void md1(int n) {
		md2(n,0);
	}
	public static void md2(int n1,int n2) {
		int r =n1/n2;
	}
	public static void main(String[] args) {
		try {
			md1(3);
		}
		catch(Throwable a) {
			a.printStackTrace();
		}
		
		System.out.println("ㅂㅂ");
		
	}

}
