package day15;


class cake1{
	int size;
	cake1(int s){
		this.size=s;
}}

class milkcake extends cake1{
	int size;
	milkcake(int s1,int s2){
		super(s1);
		this.size=s2;

		
	}
}

public class cake {

	public static void main(String[] args) {
		milkcake c1 =new milkcake(3,5);
		cake1 c2= new milkcake(3,5);
		System.out.println(c1.size);
		System.out.println(c2.size);
		
	}

}
