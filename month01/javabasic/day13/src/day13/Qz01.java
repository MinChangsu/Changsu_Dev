package day13;

public class Qz01 {

	public static void main(String[] args) {
		for(int k=1;k<=100;k++){
			if(sosu(k))
				System.out.println(k);
		}
	}
	public static boolean sosu(int x) {
		int cnt=0;
		for(int i=1;i<=x;i++) {
		if(x%i==0) {
			 cnt+=1;} }
		if(cnt==2) {
			return true;}
		return false;
		
	}
}
