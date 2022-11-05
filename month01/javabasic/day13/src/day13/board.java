package day13;

class bird{
	String name;
	
	bird(String birdname){
		name=birdname;
	}
	void flying() {
	System.out.printf("%s야 날아\n",name);	
	
	}
}


public class board {

	public static void main(String[] args) {
		bird b1 =new bird("참새");
		bird b2 =new bird("비둘기");
		bird b3 =new bird("꿩");
		
		callbird(b1);
		callbird(b2);
		callbird(b3);
	
	
	}
	public static void callbird(bird b) {
		b.flying();}
}
