package pack02;

public class Squ {
	private double b;
	private double h;
	Squ(double a,double n){

		b=a;h=n;
		
	}
	void seta(double a,double n) {
		if(a<0||b<0) {
			b=0;h=0;
			return;}
		b=a;h=n;}
	double getb() {
		return b;
	}
		
	double geth() {
		return h;
	}
	}

