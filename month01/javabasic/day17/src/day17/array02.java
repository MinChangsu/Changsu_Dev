package day17;
import java.util.*;

class Dnum{
	double num;
	Dnum(double n){num=n;}
	@Override
	public boolean equals(Object obj) {
		if(this.num==((Dnum)obj).num)
			return true;
		else return false;
	}
	
}


public class array02 {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {1,2,3};
	System.out.println(Arrays.equals(a, b));
	
	Dnum d1=new Dnum(1.1);
	Dnum d2=new Dnum(1.2);
	Dnum d3=new Dnum(1.3);
	Dnum d4=new Dnum(1.1);
	Dnum d5=new Dnum(1.2);
	Dnum d6=new Dnum(1.3);
	Dnum[] c= {d1,d2,d3};
	Dnum[] d= {d4,d5,d6};
	System.out.println(Arrays.equals(c, d));
	
	
	
	
	}

}
