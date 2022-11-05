package day18;

public class QZ02 {
	public static String sum10(int...n) {
		int s=0;
		for(int i:n) {
			s+=i;
		}
		// 자바에서 문자열+숫자는 문자열
		return "주어진숫자의 총합 : "+s;
	}
	public static void main(String[] args) {
		System.out.println(sum10(1,2,3,4,5,6,7,8,9,10));
	}

}
