package day16;


abstract class Tree{
String name="fd";
	abstract void makeFruit();
	void growingup() {
		System.out.println("나무가쑥쑥자랍니다.");
	}
}
class Tree2 extends Tree{
	void makeFruit() {
		
	}
}

public class Interface03 {

	public static void main(String[] args) {
		
		Tree2 t2 =new Tree2();
		System.out.println(t2.name);

	}

}
