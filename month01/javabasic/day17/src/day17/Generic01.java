package day17;
class Apple{public String toString() {return "사과";}}
class Orange{public String toString() {return "오렌지";}}
//타입 매개변수는 대문자 하나로 표현하는 경우가 많다.
class Box<T>{
	private T ob;

	void set(T ob) {
		this.ob=ob;
	}
	T get() {
		return this.ob;
	}
}

public class Generic01 {

	public static void main(String[] args) {
		Box<Apple> abox=new Box<Apple>();
		Box<Orange> obox=new Box<Orange>();
		
		abox.set(new Apple());
		obox.set(new Orange());
		
		System.out.println(abox.get());
		System.out.println(obox.get());
		
		
	}

}
