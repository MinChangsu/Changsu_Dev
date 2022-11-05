package day13;


class Tri{
	int mit;
	int nop;
	
	Tri(int m,int n){
		mit=m;
		nop=n;
		}
	void changemit(int m) {
		mit=m;}
	void changenop(int n) {
		this.nop=n;}
	int nul() {
		return mit*nop;
	}
}



public class Qz3 {

	public static void main(String[] args) {
		Tri t1=new Tri(3,5);
		Tri t2=new Tri(2,5);
		
		System.out.println(t1.nul());
		System.out.println(t2.nul());
		t1.changemit(4);
		t2.changemit(3);
		System.out.println(t1.nul());
		System.out.println(t2.nul());
		t1.changenop(6);
		t2.changenop(6);
		System.out.println(t1.nul());
		System.out.println(t2.nul());
		
		
	}

}
