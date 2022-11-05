package day18;
//멤버클래스 Bean을 포함한 외부 클래스 Coffee

class Bag{
	void getPencil() {
		class Pencil{
			public String toString() {
				return "연필";
			}
		}  
		Pencil p =new Pencil();
		System.out.println(p);}
}
class Coffee{
	void getCoffee() {
		new Bean().thisis();
	}
	private class Bean{
		void thisis() {
			System.out.println("에티오피아 원두");
		}
	}
	
}
class outer{
	private static int num =0;
	static class Inum{
	void shownum(){
		System.out.println(num);}
	}
	}

public class nested01 {

	public static void main(String[] args) {
		outer.Inum ob=new outer.Inum();
		ob.shownum();
		Coffee c1 = new Coffee();
		c1.getCoffee();
		Bag b =new Bag();
		b.getPencil();
	}

}
