package day14;
class NumberP{
	private int mynum =0;
	static void showInt(int n) { System.out.println(n);}
	static void showDouble(double n) {System.out.println(n);}

	void setMynum(int n) {mynum=n;}
	void showMynum() {showInt(mynum);}}
	
	
	public class ClassM {

	public static void main(String[] args) {
		
		NumberP.showInt(20);
		NumberP np= new NumberP();
		
		np.showDouble(3.15);
		np.setMynum(75);
		np.showMynum();

}
	}
		
	


