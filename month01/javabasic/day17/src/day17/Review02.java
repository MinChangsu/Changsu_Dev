package day17;

class Inum{
	int num;
	Inum(int num){this.num=num;}
	@Override
	public boolean equals(Object obj) {
		if(this.num==((Inum)obj).num) return true;
		else return false;}
	}
	
public class Review02 {

	public static void main(String[] args) {
		Inum n1=new Inum(2);
		Inum n2=new Inum(2);
	System.out.println(n1.equals(n2));
	}
}
