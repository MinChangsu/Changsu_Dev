package day17;
class Box2<T>{
	private T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}

}


public class Generic04 {

	public static void main(String[] args) {
		Box2<String> sBox = new Box2<>();
		sBox.set("happy");
		Box2<Box2<String>> wBox = new Box2<>();
		wBox.set(sBox);
		Box2<Box2<Box2<String>>> zBox =new Box2<>();
		zBox.set(wBox);
		System.out.println(zBox.get().get().get());
	}

}
