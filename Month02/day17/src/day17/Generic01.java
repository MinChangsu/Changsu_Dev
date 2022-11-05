package day17;

class Dbox<L,R>{
	private L left;
	private R right;
public void set(L o,R r) {
	left = o;
	right =r;
}
@Override
public String toString() {
	return left+"&"+right;
}
}


public class Generic01 {

	public static void main(String[] args) {
		Dbox<String,Integer>box=new Dbox<String,Integer>();
		box.set("Apple", 25);
	System.out.println(box);
	
	}

}
