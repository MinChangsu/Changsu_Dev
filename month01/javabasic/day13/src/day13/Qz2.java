package day13;

public class Qz2 {

	public static void main(String[] args) {
		System.out.println(mul(3));
	}
	public static int mul(int x) {
		
		if(x==0)
			return 1;
		return 2*mul(x-1);
	}
}
