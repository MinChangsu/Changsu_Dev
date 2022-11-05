package day17;
class Boxs<T>{
	protected T ob;
	public void set(T o) {ob=o;}
	public T get() {return ob;}
}
class SteelBox<T> extends Boxs<T>{
	public SteelBox(T o) {ob=o;}
}


public class Generic08 {

	public static void main(String[] args) {
	Boxs<Integer> ibox =new SteelBox<>(7959);
	Boxs<String> sbox =new SteelBox<>("simple");
	
	}

}
