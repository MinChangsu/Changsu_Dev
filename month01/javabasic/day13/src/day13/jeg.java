package day13;

public class jeg {

	public static void main(String[] args) {
		System.out.println(fc(5));
		
	}
public static int fc(int x) {
	if(x==0)
		return 1;
	return x*fc(x-1);
	
}
}
