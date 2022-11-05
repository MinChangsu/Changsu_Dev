package day17;

class Bo<T>{
	private T ob;
	public void set(T o) {ob=o;}
	public T get() {return ob;}
}
class Emptybo{
	public static <T> Bo<T>makeBox(){
		Bo<T> b1 = new Bo<T>();
		return b1;
	}
}
public class Ge01 {

	public static void main(String[] args) {
		Bo<Integer> ibox=Emptybo.makeBox();
		ibox.set(25);
		System.out.println(ibox.get());
		
	}

}
